import java.util.*;
public class leftrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of numbers in array: ");
        int c=sc.nextInt();
        int arr[]=new int[c];
        System.out.println("Enter numbers: ");
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
        int rotated[] = rotate(arr);
        
        System.out.print("Rotated array: ");
        for (int i = 0; i < rotated.length; i++)
        {
            System.out.print(rotated[i] + " ");
        }
    }
    public static int[] rotate(int ar[])
    {
        int arnew[]=new int[ar.length];
        for(int i=0;i<ar.length-1;i++)
        {
           arnew[i]=ar[i+1];
        }
        arnew[ar.length-1]=ar[0];
        return arnew;
    }
    
}
