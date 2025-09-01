import java.util.*;
public class sorted {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter count of numbers in array: ");
        int c=sc.nextInt();
        int arr[]=new int[c];
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
     boolean res=sort(arr);
    System.out.println(res);
    }
    public static boolean sort(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                return false;
            }
        }
        return true;
    }
    
}
