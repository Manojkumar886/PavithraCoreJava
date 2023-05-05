package FundamentalJava;

import java.util.Scanner;

public class ControlStructures
{
    public static void main(String[] args)
    {
//        ControlStructures control=new ControlStructures();
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
            System.out.println("your username value is not same");
        }
    }

    public static void NestedIf(int mathsmark,int biologymark,int physicsmark,int chemistrymark)
    {
        int phyChe=(physicsmark+chemistrymark);
        if(mathsmark>=95 && phyChe>=160)
        {
            System.out.println("Your are choose arts and BE category only");
            if(biologymark>=96 && mathsmark>=90 || phyChe>=160)
            {
                System.out.println("your biologymark :"+biologymark+" your are eligible all category of groups (Arts,Engineer,Medical)");
            }
            else {
                System.out.println("your are only not eligible for medical groups");
            }
        }
        else {
            System.out.println("only choosed arts groups....!");
        }
    }
}
