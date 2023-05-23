package FundamentalJava.Polymorphism;

public class UsingString03 extends  UsingString02
{
    public void Stringmethod(String value1,String value2)
    {
        System.out.println("first class -based on ComparetoIgnorecase method");
        if(value1==value2)
        {
            System.out.println("your values are same");
        }
    }

    public static void main(String[] args)
    {
        UsingString01 obj=new UsingString02();//upcasting
        obj.Stringmethod("Manojkumar","manojKumar");

        UsingString01 obj1=new UsingString03();//upcasting
        obj1.Stringmethod("Pavi","Pavi");

        UsingString01 obj2=new UsingString01();//normal object creation


    }
}
