package FundamentalJava.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingandUpdatingAnArray
{
    public static  void Reading(float[] heights)
    {
        int position=4;
        System.out.println(heights[position]);
//        Scanner scan=new Scanner(System.in);
//        System.out.println("\n what is your starting value");
//        int startvalue=scan.nextInt();
//        System.out.println("what is you end value");
//        int end =scan.nextInt();*
//        for(;startvalue<end;startvalue++)
//        {
//            System.out.println(heights[startvalue]);
//        }

    }
    public void Updating(String [] brands)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Before Updating Mobile Brands"+ Arrays.toString(brands));
        System.out.println("which index of value you want replace");
        int index=scan.nextInt();
        System.out.println("Please enter your new mobile brand name");
        String newBrand=scan.next();
        brands[index]=newBrand;//updating
        System.out.println("After updating mobile brands");
        for(String newbrands:brands)
        {
            System.out.print((newbrands)+",");
        }

    }

    public static void main(String[] args)
    {
        String MobileBrands[]={"Oppo","Redmi","Vivo","Apple","Oneplus","IQ07","Nokia","Samsung","Realme"};
        ReadingandUpdatingAnArray update=new ReadingandUpdatingAnArray();
        update.Updating(MobileBrands);
        float heights[]={134.32f,166.45f,161.2f,163.4f,177.2f,180.3f};
        Reading(heights);
    }
}
