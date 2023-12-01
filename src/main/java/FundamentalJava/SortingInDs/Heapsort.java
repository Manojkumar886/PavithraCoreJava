package FundamentalJava.SortingInDs;

import java.util.Arrays;

public class Heapsort
{

    public static void loopprocess(int []arr)
    {
        int n= arr.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }

        for (int pos=n-1;pos>=0;pos--)
        {
            int temp=arr[0];
            arr[0]=arr[pos];
            arr[pos]=temp;

            heapify(arr,n,0);
        }
    }

    public static  void heapify(int []arr,int n,int parent)
    {
//        n=7
        int maxmium=parent; //2
         int left=2*parent+1;  //5
        int right=2*parent+2;  //6

        if(left<n && arr[left]>arr[maxmium])
            maxmium=left;

        if (right<n && arr[right]>arr[maxmium])
            maxmium=right;

        if(maxmium!=parent)
        {
            int temp=arr[parent];
            arr[parent]=arr[maxmium];
            arr[maxmium]=temp;
            heapify(arr,n,maxmium);
        }

    }
    public static void main(String[] args)
    {
     int [] mynumbers={89,1,35,25,15,7,95};

        System.out.println(" Before Sorting Values : "+ Arrays.toString(mynumbers));
        loopprocess(mynumbers);
        System.out.println(" After Sorting Values : "+ Arrays.toString(mynumbers));


    }
}
