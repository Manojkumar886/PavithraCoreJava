package FundamentalJava.OOPS.SingleInheritance;

import java.util.Arrays;

public class ClassA
{
    public void Execution()
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
}
