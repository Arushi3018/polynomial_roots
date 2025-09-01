import java.util.*;
public class selectionsort {
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
        for(int i=0;i<ar.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[j]>ar[min])
                {
                    min=j;
                }
            }
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
            }
        }
    }
    
