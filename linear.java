import java.util.*;
public class linear {
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
        System.out.println("Enter the element to be searched: ");
        int element=sc.nextInt();
        int res=search(arr, element);
        System.out.println("Element found at position: "+res);
    }
    public static int search(int ar[],int element)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
}
