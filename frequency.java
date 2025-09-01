import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of numbers in array: ");
        int c=sc.nextInt();
        int arr[] = new int[c];
        System.out.println("Enter the numbers in array: ");
        for(int i=0;i<c; i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean res=freq(arr);
        System.out.println(res);
    }
    public static boolean freq(int ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                }
            }
        }
        if (count>1)
        {
            return true;
        }
        return false;
    } 
}
