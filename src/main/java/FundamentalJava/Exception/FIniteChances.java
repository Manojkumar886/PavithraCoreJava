package FundamentalJava.Exception;

import java.util.Scanner;

public class FIniteChances
{
    public void Limitedchances(int limitsize)
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
                if(limitsize<3)
                {
                    System.out.println(limitsize+" chance is over-remaining"+(3-limitsize));
                    limitsize++;
                    Limitedchances(limitsize);
                }
                else {
                    System.out.println("maximum chance is over");
                }
            }
        }

    public static void main(String[] args)
    {
       FIniteChances fIniteChances=new FIniteChances();
       fIniteChances.Limitedchances(1);
    }
}
