import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double av=avg(a, b, c);
        System.out.println("Average= " +av);
    }
    public static double avg(double a,double b,double c)
    {
        double average=(a+b+c)/3;
        return average;
    }
}
