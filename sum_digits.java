import java.util.*;
public class sum_digits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println("Sum of digits= "+s);
    }
    public static int sum(int num)
    {
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
         }
         return sum;
    }  
}
