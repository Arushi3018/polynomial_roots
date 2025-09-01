import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r=pal(n);
        if (n==r)
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
    }
    public static int pal(int num)
    {
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return rev;
    }
}
