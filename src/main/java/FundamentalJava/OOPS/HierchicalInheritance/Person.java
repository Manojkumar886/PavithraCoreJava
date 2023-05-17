package FundamentalJava.OOPS.HierchicalInheritance;

import java.util.Scanner;

public class Person
{
    public static void Person1()
    {
        System.out.println("What is Person?");
        Scanner scan=new Scanner(System.in);
        String Person=scan.nextLine();

        System.out.println("Person -"+Person);
    }
    public  void Person2()
    {
        System.out.println("Type of Person?");
        System.out.println("Type of Person -Conscientiousness. People who rank highest in conscientiousness are efficient, well-organized, dependable, and self-sufficient. ...\n" +
                "Extroversion. ...\n" +
                "Agreeableness. ...\n" +
                "Openness to Experience. ...\n" +
                "Neuroticism.");
    }
}
