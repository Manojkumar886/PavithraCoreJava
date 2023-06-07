package FundamentalJava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Muticatch
{
    public static void main(String[] args)
    {
        int avalue=0;
        int bvalue=0;
        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("please enter your a value");
            avalue= scan.nextInt();
            System.out.println("please enter bvalue");
            bvalue=scan.nextInt();
            System.out.println(avalue/bvalue);
        }
        catch(ArithmeticException Ae)
        {
            System.out.println(Ae+"b value cannot be insert a zero");
            Scanner scan=new Scanner(System.in);
            System.out.println("please enter your a value");
            avalue= scan.nextInt();
            System.out.println("please enter bvalue");
            bvalue=scan.nextInt();
            System.out.println(avalue/bvalue);
        }
        catch (InputMismatchException ime)
        {
            System.out.println(" please enter only numeric values");
            Scanner scan=new Scanner(System.in);
            System.out.println("please enter your a value");
            avalue= scan.nextInt();
            System.out.println("please enter bvalue");
            bvalue=scan.nextInt();
            System.out.println(avalue/bvalue);
        }
    }
}
