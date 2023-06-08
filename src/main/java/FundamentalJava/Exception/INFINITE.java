package FundamentalJava.Exception;

import java.util.Scanner;

public class INFINITE
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
            unlimitedchances();
        }
    }
    public static void main(String[] args)
    {
        INFINITE finite=new INFINITE();
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
