package FundamentalJava.VariableTypes;

public class DemoVariables
{
    public static void main(String[] args)
    {
//        Object creation
//        Classname ObjectName=new Classname();


        int alpha=97;//Instance  Variable
        char beta=(char) alpha;//Narrowing
        System.out.println("my number is :" +alpha+" \t 97 number key value is :"+beta);
        DemoVariables Obj=new DemoVariables();//object creation
        Obj.LocalPerforamnce();
    }
    public void LocalPerforamnce()//user defined method
    {
        String username="Manojkumar434";//Local variable
        String password="Maddy@123";
        System.out.println(username+password);
    }
}
