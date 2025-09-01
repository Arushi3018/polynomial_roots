import java.util.*;
class Solution {
    public static int largest(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++)
        {
                if(nums[i]>max)
                {
                    max=nums[i];
                }
        }
            return max;
        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of numbers in array: ");
        int c=sc.nextInt();
        int arr[]=new int[c];
        System.out.println("Enter numbers in array: ");
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=largest(arr);
        System.out.println("The largest element in array is: "+res); 
    }
}

