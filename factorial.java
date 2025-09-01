import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to whose factorial you want to calculate: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n; i>=1; i--)
        {
            fact*=i;
        }
        System.out.println("Factorial of number= " +fact);
    }
}
