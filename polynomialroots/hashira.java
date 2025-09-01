package polynomialroots;
import java.util.*;

public class hashira {

    public static void main(String[] args) {
        // Example JSON input (you can paste your big test case here)
        String input = "{\n" +
                "  \"keys\": {\"n\": 4, \"k\": 3},\n" +
                "  \"1\": {\"base\": \"10\", \"value\": \"4\"},\n" +
                "  \"2\": {\"base\": \"2\", \"value\": \"111\"},\n" +
                "  \"3\": {\"base\": \"10\", \"value\": \"12\"},\n" +
                "  \"6\": {\"base\": \"4\", \"value\": \"213\"}\n" +
                "}";

        // --- Step 1: Parse "n" and "k" ---
        int n = extractInt(input, "\"n\"");
        int k = extractInt(input, "\"k\"");

        // --- Step 2: Parse roots ---
        List<Long> roots = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String key = "\"" + i + "\"";
            if (!input.contains(key)) continue;

            String block = extractBlock(input, key);

            int base = extractInt(block, "\"base\"");
            String value = extractString(block, "\"value\"");

            long root = Long.parseLong(value, base);
            roots.add(root);
        }

        // --- Step 3: Take first k roots ---
        List<Long> selected = roots.subList(0, Math.min(k, roots.size()));

        // --- Step 4: Build polynomial ---
        long[] coeffs = buildPolynomial(selected);

        // --- Step 5: Print coefficients ---
        System.out.println("Polynomial coefficients:");
        for (long c : coeffs) {
            System.out.print(c + " ");
        }
    }

    // --- Utility: Extract integer value for given key ---
    private static int extractInt(String text, String key) {
        int idx = text.indexOf(key);
        if (idx == -1) return -1;
        int colon = text.indexOf(":", idx);
        int end = colon + 1;
        while (end < text.length() && !Character.isDigit(text.charAt(end)) && text.charAt(end) != '-') end++;
        int start = end;
        while (end < text.length() && (Character.isDigit(text.charAt(end)) || text.charAt(end) == '-')) end++;
        return Integer.parseInt(text.substring(start, end));
    }

    // --- Utility: Extract string value for given key ---
    private static String extractString(String text, String key) {
        int idx = text.indexOf(key);
        if (idx == -1) return "";
        int colon = text.indexOf(":", idx);
        int firstQuote = text.indexOf("\"", colon + 1);
        int secondQuote = text.indexOf("\"", firstQuote + 1);
        return text.substring(firstQuote + 1, secondQuote);
    }

    // --- Utility: Extract a block like { "base":..., "value":... } ---
    private static String extractBlock(String text, String key) {
        int idx = text.indexOf(key);
        if (idx == -1) return "";
        int start = text.indexOf("{", idx);
        int end = text.indexOf("}", start);
        return text.substring(start, end + 1);
    }

    // --- Polynomial expansion ---
    private static long[] buildPolynomial(List<Long> roots) {
        int degree = roots.size();
        long[] coeffs = new long[degree + 1];
        coeffs[0] = 1; // leading coefficient

        for (long root : roots) {
            long[] newCoeffs = new long[coeffs.length];
            for (int i = 0; i < coeffs.length - 1; i++) {
                newCoeffs[i] += coeffs[i];
                newCoeffs[i + 1] -= coeffs[i] * root;
            }
            coeffs = newCoeffs;
        }
        return coeffs;
    }
}

