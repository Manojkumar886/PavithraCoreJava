package FundamentalJava.Arrays;

import java.util.Scanner;

public class JaggedArray
{
    public static void main(String[] args)
    {
        String Patientname[][]=new String[3][];
        Patientname[0]=new String[3];
        Patientname[1]=new String[2];
        Patientname[2]=new String[5];
        for(int row=0;row<Patientname.length;row++)//declared values
        {
            for(int col=0;col<Patientname[row].length;col++)
            {
                Scanner scan=new Scanner(System.in);
                System.out.println("row no :"+row+" col no :"+col+" This room patient name is ");
                Patientname[row][col]=scan.next();
            }
        }

        for(int row=0;row<Patientname.length;row++)
        {
            for(int col=0;col<Patientname[row].length;col++)
            {
                System.out.print(Patientname[row][col]+" ");
            }
            System.out.println();
        }

    }
}
