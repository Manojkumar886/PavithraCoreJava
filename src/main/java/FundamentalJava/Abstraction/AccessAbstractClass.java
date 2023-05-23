package FundamentalJava.Abstraction;

public class AccessAbstractClass extends ImplementsProcess
{


    @Override
    public void noImplementMethod()
    {
        System.out.println("Achieved steps:\n" +
                "1.must be used in abstract keyword...\n" +
                "2.a method is without (no implementation) is known as abstract method");
    }


    public static void main(String[] args)
    {
        AccessAbstractClass abstraction=new AccessAbstractClass();
        abstraction.ImplementMethod();
        abstraction.noImplementMethod();

    }
}
