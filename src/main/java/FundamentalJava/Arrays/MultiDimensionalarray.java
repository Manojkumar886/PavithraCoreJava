package FundamentalJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalarray
{
    public static void main(String[] args)
    {
//        String [][] Basic={{"Manojkumar","Manikandan","Nandhakumar"},{"Nivash","Nithesh","Gopinath"},{"VijayaSarathy","Jagadeesh","Karan"}};
//
//        c

        int [][] MedicalBuilding=new int[3][4];
        for(int row=0;row<MedicalBuilding.length;row++)
        {
            for(int col=0;col<4;col++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("your building row no :"+row+" col no :"+col);
                MedicalBuilding[row][col]=scan.nextInt();
            }
        }

        for ( int[] medical:MedicalBuilding)
        {
            for(int medical1:medical)
            {
                System.out.print(medical1+" ");
            }
            System.out.println();
        }


    }
}
