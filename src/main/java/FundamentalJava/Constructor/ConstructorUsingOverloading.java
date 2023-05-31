package FundamentalJava.Constructor;

public class ConstructorUsingOverloading
{
    public ConstructorUsingOverloading()
    {
        System.out.println("Welcome to overloading in Constructor");
    }
    public ConstructorUsingOverloading(int sin,String cos)
    {
        int Connect=sin+cos.compareTo("Kavitha");
        System.out.println(Connect);
    }
    public ConstructorUsingOverloading(double Salary,double tax)
    {
      int narrowing=(int)Salary+(int)tax;
        System.out.println("Convert to double to int "+narrowing);
    }

    public static void main(String[] args)
    {
     new ConstructorUsingOverloading(6.4,9.9);
     new ConstructorUsingOverloading(90000,"Pavithra");
     new ConstructorUsingOverloading(800000,"Rohini");
     new ConstructorUsingOverloading(89,"Manoj");//parameterized constructor
     ConstructorUsingOverloading overloading=new ConstructorUsingOverloading();//calling normal constructor
    }
}
