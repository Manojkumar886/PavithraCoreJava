package FundamentalJava.Arrays;

import java.util.Scanner;

public class PalindromePattern
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter your row count");
        int row=scan.nextInt();
        int i,j;
        //declare for loop for every new row
        for( i=1;i<=row;i++)
        {
//            this for loop using spaces
            for(j=i;j<=row;j++)
            {
                System.out.print(" ");
            }

//            this for loop is print a number 1 to i]
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //this loop is for the number in reverse order
            for(j=i-1;j>=1;j--)
                System.out.print(j+"");
            System.out.println();
        }

    }
}
