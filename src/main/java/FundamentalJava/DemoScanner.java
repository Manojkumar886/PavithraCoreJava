package FundamentalJava;

import java.util.Scanner;

public class DemoScanner
{
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("what is your name ");
        String myname =scan.nextLine();
        System.out.println(myname);
        System.out.println("what is your current CTC");
        float SalaryPackage=scan.nextFloat();
        System.out.println("my CTC per annum :"+SalaryPackage);
        System.out.println("what is your age :");
        int Myage= scan.nextInt();

        int calculate=(int) SalaryPackage+Myage;

        System.out.println("Sample Narrowing perforamnce executed value is :"+calculate);

    }
}
