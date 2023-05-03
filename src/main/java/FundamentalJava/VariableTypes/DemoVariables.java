package FundamentalJava.VariableTypes;

public class DemoVariables
{
    static String LastTypeofVariable="Static Variable";//Static variable
    int max=10;
    public static void main(String[] args)
    {
//        Object creation
//        Classname ObjectName=new Classname();

//        static int a1=89;//not supported
        int alpha=97;//Instance  Variable
        char beta=(char) alpha;//Narrowing
        System.out.println("my number is :" +alpha+" \t 97 number key value is :"+beta);
        DemoVariables Obj=new DemoVariables();//object creation
        Obj.LocalPerforamnce();
        System.out.println(LastTypeofVariable);
        StaticMethod();//

//        System.out.println(max);//global variable not supported in main method
    }
    public void LocalPerforamnce()//user defined method
    {
        System.out.println(LastTypeofVariable);
        String username="Manojkumar434";//Local variable
        String password="Maddy@123";
        System.out.println(username+password);
        System.out.println("my maximum number count is"+max);//Global Variable
    }
    static
    {
        System.out.println("Welcome to Type of Variable");
    }

    public static void StaticMethod()
    {
//        static int a=10;not supported
        System.out.println("Thank you...!");
    }

}
