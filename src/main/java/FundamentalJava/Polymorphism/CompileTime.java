package FundamentalJava.Polymorphism;

public class CompileTime
{
    public void ArithemeticOperator(int a,int b)
    {
        int addition=a+(b*10);
        System.out.println("Addition of Two numbers  value is "+addition);

    }
    public void ArithemeticOperator(float a,float b)
    {
        float substraction=(a*10)+b;
        System.out.println("substractio  of two float values "+substraction);
    }
    public void ArithemeticOperator(String name,String myfrdName)
    {
        if(name!=myfrdName)
        {
            System.out.println("my frd name and myname is different");
        }

    }

    public static void main(String[] args)
    {
        CompileTime overloading=new CompileTime();
        overloading.ArithemeticOperator(2.3f,5.6f);
        overloading.ArithemeticOperator(12,34);
        overloading.ArithemeticOperator("Manoj","Nandha");
    }
}
