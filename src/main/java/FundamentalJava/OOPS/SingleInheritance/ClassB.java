package FundamentalJava.OOPS.SingleInheritance;

public class ClassB extends ClassA
{
    public void EXECUTION()
    {
        System.out.println("welcome to Single Inheritance");
    }
    public static void main(String[] args)
    {
        ClassB b=new ClassB();
        b.Execution();
        b.EXECUTION();

    }

}
