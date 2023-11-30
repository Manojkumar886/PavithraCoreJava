package FundamentalJava.SortingInDs;

import java.util.Arrays;

public class quickSort
{
    public static void Quick(int [] arr,int low,int high)
    {
        if(low>high)
            return;
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=arr[mid];

        while(start<=end)
        {
            while (arr[start]<pivot)
                start++;
            while (arr[end]>pivot)
                end--;
            if(start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        Quick(arr,low,end);
        Quick(arr,start,high);
    }
    public static void main(String[] args)
    {
        int numbers[]={5,75,65,11,3,45,1};
        System.out.println("before sorting values :"+ Arrays.toString(numbers));
        Quick(numbers,0, numbers.length-1);
        System.out.println("After sorting values :"+ Arrays.toString(numbers));
    }
}
