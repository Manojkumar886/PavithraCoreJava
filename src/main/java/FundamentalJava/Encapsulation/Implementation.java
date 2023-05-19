package FundamentalJava.Encapsulation;

import java.util.Scanner;

public class Implementation
{
    public static void main(String[] args)
    {
        MobileDetails mobile=new MobileDetails();
        Scanner scan=new Scanner(System.in);
        System.out.println("please tell us Your mobile name");
        mobile.setMobileName(scan.next());
        mobile.setMobileMOdel("Realme-1");
       mobile.setRam(64);
       mobile.setCustomername("Manojkumar");

        System.out.println("my customer name is "+mobile.getCustomername());

    }
}
