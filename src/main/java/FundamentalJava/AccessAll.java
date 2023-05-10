package FundamentalJava;

import java.util.Scanner;

public class AccessAll
{
    static
    {
        System.out.println("welcome to everest Enterprises");
    }
    public static void main(String[] args)
    {
        int a=1;
       do{
           Scanner scans=new Scanner(System.in);
           System.out.println("which type of laptop model you want....?");
           System.out.println("IT\nACCOUNTS\nGAMING\nNORMALUSE");
           String usage=scans.next();
           switch (usage)
           {
               case "IT":
                   System.out.println("you are choosen IT-Professional Laptops\t Currently Available");
                   System.out.println("which price of laptop you buy....");
                   int price =scans.nextInt();
                   if(price<18000 || price<=40000)
                   {
                       System.out.println("you are choose this  "+price+" currently available laptops are "+"\n HP\n Lenovo\n Dell");
                       String laptopbrand=scans.next();
                       switch (laptopbrand)
                       {
                           case "HP":
                               System.out.println("HP Specifications "+"\n intel Processor\n new generation\n graphics card(AMD)");
                               break;
                           default:
                               System.out.println("currently not avilable"+laptopbrand);
                       }
                   } else if (price>=45000)
                   {
                       System.out.println("you are choose this  "+price+" currently available laptops are "+"\n Apple \n One Plus\n Dell with Touch Pad");

                   }

                   break;
               case "GAMING":
                   System.out.println("you are choose gaming laptop \n not available ");
                   break;
               case "ACCOUNTS":
                   ControlStructures.NestedIf(99,96,87,76);
                   int ABvalue=110;
                   int BAvalue=340;
                   String username="Manojkumar";
                   float ABBAconvert=ABvalue+BAvalue;
                   Scanner scan=new Scanner(System.in);
                   String mystatename="Kerala";
                   if(username.equalsIgnoreCase("manojkumar")&&BAvalue>=370)
                   {
                       System.out.println("BA value is greater then equal to 340");
                   }
                   else if (mystatename=="Kerala")
                   {
                       System.out.println("mystatename is :"+mystatename);
                   } else if (mystatename!=username)
                   {
                       System.out.println("yes...my statename and username is not same");
                   } else
                   {
                       int ab= scan.nextInt();

                       System.out.println("your username value is not same");
                   }
               default:
                   System.out.println(usage+"unavailable ");a++;
           }
       }while (a<=3);

    }
}
