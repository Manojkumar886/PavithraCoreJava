package FundamentalJava.SortingInDs;

import java.util.Arrays;

public class BubbleSort
{
    public static  void Bubble(int [] fruits)
    {
        for(int i=0;i< fruits.length;i++)
        {
            for(int j=0;j< fruits.length-i-1;j++)
            {
                if(fruits[j]>fruits[j+1])
                {
                    int temp=fruits[j];
                    fruits[j]=fruits[j+1];
                    fruits[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
//        String furitsname[]={"Banana","Apple","Mango","PineApple","IceApple","Watermelon"};
        int fruitsprice[]={34,65,1,45,22,46,99,67};
        System.out.println(" Before Sorting Fruits Name :\n"+ Arrays.toString(fruitsprice));
        Bubble(fruitsprice);
        System.out.println(" After Sorting Fruits Name :\n"+ Arrays.toString(fruitsprice));



    }
}
