package FundamentalJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingAnArray
{
    public static void Execution()
    {
        String [] ProgrammingLanguages={"Java","Python","c-sharp","R-programming","Data Structures","Problem Solving Techniq"};

//        System.out.println(ProgrammingLanguages);

//        for(int index=0;index<ProgrammingLanguages.length;index++)
//        {
//            System.out.println(ProgrammingLanguages[index]);
//        }

//        for(String  connection:ProgrammingLanguages)
//        {
//            System.out.println(connection);
//        }

        System.out.println(Arrays.toString(ProgrammingLanguages));
    }

    public static void main(String[] args)
    {
        Execution();

        Scanner scan=new Scanner(System.in);
        int [] sections=new int[5];

//        sections[4]='J';
//
//        System.out.println(Arrays.toString(sections));

        for(int mypos=0;mypos< sections.length;mypos++)
        {
            System.out.println("what is your favoriate number");
            sections[mypos]=scan.nextInt();
        }

        for(int section1:sections)
        {
            System.out.println(section1);
        }
    }
}
