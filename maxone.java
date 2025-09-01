import java.util.*;
public class maxone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of numbers in array: ");
        int c=sc.nextInt();
        int arr[]=new int[c];
        System.out.println("Enter only 0 and 1: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=one(arr);
        System.out.println("Max no. of one's= "+res);
    }
    public static int one(int ar[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==1)
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else 
            {
                count=0;
            }
        }
        return max;
    } 
}
