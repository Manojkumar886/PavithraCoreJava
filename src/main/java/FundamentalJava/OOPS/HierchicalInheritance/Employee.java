package FundamentalJava.OOPS.HierchicalInheritance;

public class Employee  extends Person
{
    public void Employee()
    {
        System.out.println("What is employee");
        System.out.println("a person who works for somebody.");
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.Employee();
        emp.Person2();
        emp.Person1();//static method also getting outside class with help by userdefined management


    }

}
