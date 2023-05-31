package FundamentalJava.Abstraction;

public abstract class ImplementsProcess
{
    public void ImplementMethod()
    {
        System.out.println("Hiding the implementation and shown only functionality to the user");
    }
    public abstract void noImplementMethod();//no implementation method

    public static void main(String[] args)
    {

//        classname obj=new Classname();
        ImplementsProcess pro=new AccessAbstractClass();
        pro.ImplementMethod();
        pro.noImplementMethod();
    }
}
