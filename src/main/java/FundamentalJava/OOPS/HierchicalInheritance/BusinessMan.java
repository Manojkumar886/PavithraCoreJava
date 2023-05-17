package FundamentalJava.OOPS.HierchicalInheritance;

public class BusinessMan extends Person
{
    public void Businessman()
    {
        System.out.println("BusinessMan \t- a man who is skilful at dealing with money.");
    }

    public static void main(String[] args)
    {
        BusinessMan man=new BusinessMan();
        man.Person2();
        man.Businessman();

    }
}
