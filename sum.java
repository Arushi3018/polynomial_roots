import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        System.out.println("Enter count of numbers want to generate: ");
        int count=sc.nextInt();
        System.out.println("Generated random numbers:");
        for (int i = 0; i < count; i++) {
            int n= sc.nextInt();

            if(n%2==0)
            {
                even+=n;
            }
            else{
                odd+=n;
            }
        }
        System.out.println("Sum of even numbers= " +even);
        System.out.println("Sum of odd numbers= "+odd);
    }   
}
