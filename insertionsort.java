import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of numbers in array: ");
        int c=sc.nextInt();
        int arr[]=new int[c];
        System.out.println(("Enter numbers in array: "));
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        System.out.println("Sorted array:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int ar[])
    {
        for(int i=1;i<ar.length;i++)
        {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] < key)
            {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }
    }
    
}
