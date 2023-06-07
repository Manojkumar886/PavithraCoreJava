package FundamentalJava.Exception;

import java.util.Scanner;

public class FiniteChances
{
    public void unlimitedchances()
    {
        String mycontent="String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.";
        try
        {
            Scanner scan=new Scanner(System.in);

            System.out.println("Please enter your starting index value");
            int start=scan.nextInt();

            System.out.println("Please enter your ending index value");
            int end=scan.nextInt();

            System.out.println(mycontent.substring(start,end));
        }
        catch(StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe+" your sentence lenght is "+mycontent.length()+" your ending value less then of"+mycontent.length());
            Scanner scan=new Scanner(System.in);

            System.out.println("Please enter your starting index value");
            int start=scan.nextInt();

            System.out.println("Please enter your ending index value");
            int end=scan.nextInt();

            System.out.println(mycontent.substring(start,end));
            unlimitedchances();
        }
    }
    public static void main(String[] args)
    {
        FiniteChances finite=new FiniteChances();
        finite.unlimitedchances();
//
//       try
//       {
//           finite.unlimitedchances();
//       }
//       catch(StringIndexOutOfBoundsException siobe)
//       {
//            finite.unlimitedchances();
//       }


    }
}
