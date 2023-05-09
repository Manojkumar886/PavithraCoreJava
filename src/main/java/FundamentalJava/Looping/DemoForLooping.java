package FundamentalJava.Looping;

import java.util.Scanner;

public class DemoForLooping
{
    public static void ExecutionofLooping(int mynumber)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your age");
        int age=scan.nextInt();
        int connectnumber=mynumber;
        for(;connectnumber<=5;connectnumber++)
        {
            if(connectnumber==1)
            {
                if(age==18)
                {
                    System.out.println("your age is "+age);
                }
                else
                {
                    System.out.println("your age is less than or more then 18 -not equal to 18");
                }
            }
            else if (connectnumber==2)
            {
                System.out.println("your looping number is "+connectnumber);
            }

            System.out.println(connectnumber+" chance is over -more then chance"+(5-connectnumber));

        }

    }
    public static void main(String[] args)
    {
        ExecutionofLooping(1);
    }
}
