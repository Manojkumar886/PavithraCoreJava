package FundamentalJava.SortingInDs;

import java.util.Arrays;

public class DemoInsertionSort
{
    public static void Insertion(float [] array)
    {
        for(int i=1;i< array.length;i++)
        {
            float key=array[i];
            int j=i-1;
            while(j>=0 && key< array[j])
            {
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args)
    {
        float [] data={33.5f,12.3f,88.9f,56.6f,76.8f,90.6f,44.4f};
        System.out.println(" Before Sorting Values : "+ Arrays.toString(data));
        Insertion(data);
        System.out.println(" After Insertion Sorting Values : "+ Arrays.toString(data));

    }
}
