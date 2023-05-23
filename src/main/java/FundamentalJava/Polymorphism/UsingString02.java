package FundamentalJava.Polymorphism;

public class UsingString02 extends  UsingString01
{
    public void Stringmethod(String value1,String value2)
    {
        System.out.println("second class -based on equalignore and equal");
        if(value1.equalsIgnoreCase(value2))
        {
            System.out.println("your values are same but uppercase and lowercase totally different");
        }
    }
}
