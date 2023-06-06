package FundamentalJava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchFinallyUsage
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("please tell us your age");
            int age=scan.nextInt();
            System.out.println("My age is "+age);
        }
        catch (InputMismatchException IME)
        {
          try
          {
              System.out.println(IME+" please enter only numeric numbers");
              Scanner scan=new Scanner(System.in);
              System.out.println("please tell us your age");
              int age=scan.nextInt();
              System.out.println("My age is "+age);
          }
          catch(InputMismatchException IME1)
          {
              System.out.println(IME1+" please enter only numeric numbers");
              Scanner scan=new Scanner(System.in);
              System.out.println("please tell us your age");
              int age=scan.nextInt();
              System.out.println("My age is "+age);
          }

        }

        finally {
            System.out.println("Thank you");
        }
//        try
//        {
//            String Laptopname=null;
//            System.out.println(Laptopname.length());
//        }
//        catch (NullPointerException NPE)
//        {
//            System.out.println(NPE);
//            String Lap1="Lenovo";
//            String Laptopname=Lap1;
//            System.out.println(" Laptop name length is :"+Laptopname.length());
//        }
//        finally
//        {
//            System.out.println("ThankYou");
//        }
    }
}
