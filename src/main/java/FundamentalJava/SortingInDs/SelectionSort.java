package FundamentalJava.SortingInDs;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int numbers[]={5,75,65,11,3,45,1};

        System.out.println(" Before Sorting Fruits Name :\n"+ Arrays.toString(numbers));


        for(int i=0;i<numbers.length;i++)
        {
            int min_value=numbers[i];
            int min_index=i;
            for(int j=i;j< numbers.length;j++)
            {
                if(numbers[j]<min_value) {
                    min_value=numbers[j] ;
                    min_index=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=numbers[min_index];
            numbers[min_index]=temp;
        }

        System.out.println("After Sorting Fruits Name :\n"+ Arrays.toString(numbers));
    }
}
