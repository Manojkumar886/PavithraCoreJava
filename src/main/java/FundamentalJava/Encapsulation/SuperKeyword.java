package FundamentalJava.Encapsulation;

public class SuperKeyword extends SampleKeywrodAccess
{
    int a=10;
    public void key1()
    {
        System.out.println("Welcome");
        key1();//current class method
        super.key1();//parent class method
        System.out.println(a);
        System.out.println(super.a);
    }

    public static void main(String[] args)
    {
        SuperKeyword j=new SuperKeyword();
        j.key1();
    }

}

class SampleKeywrodAccess
{
    int a=100;
    public void key1()
    {
        System.out.println("Thank you");
    }
}
