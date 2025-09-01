import java.util.*;
public class secondlargest
 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter count of numbers in array: ");
    int c=sc.nextInt();
    int arr[]=new int[c];
    System.out.println("Enter numbers in array: ");
    for(int i=0;i<c;i++)
    {
        arr[i]=sc.nextInt();
    }
    int res=seclarge(arr);
    System.out.println("Second Largest number: "+res);
    }
    public static int seclarge(int ar[])
    {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max){
                secmax=max;
                max=ar[i];
            }
            else if(ar[i]>secmax && ar[i]!=max)
            {
                secmax=ar[i];
            }
        }
        if(secmax==Integer.MIN_VALUE)
        {
            return -1;
        }
        return secmax;
    }
}
