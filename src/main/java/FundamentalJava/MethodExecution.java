package FundamentalJava;

import java.util.Scanner;

public class MethodExecution
{
    public void Basic1()
    {
        System.out.println("Normal Method Execution without return type");
    }

    public String withReturn()
    {
        System.out.println("with return type using string");
        String Mynative="Namakkal";
        return Mynative;
    }

    public int withreturnExa1()
    {
        int a=10;
        int b=20;
       if(a<b)
           return a;
       else
           return  b;
    }

    public static void main(String[] args)
    {
        MethodExecution methodExe=new MethodExecution();
        methodExe.Basic1();
        String Myplace= methodExe.withReturn();
        System.out.println("my native place is "+Myplace);
        int myvalue= methodExe.withreturnExa1();
        System.out.println("my return integer value is "+myvalue);
        Scanner scan=new Scanner(System.in);
        methodExe.withAruguments(scan.next(), scan.next());
        int calculation1=withreturnandAruguments(45,3);
        System.out.println("withreturnandaruguments method value is :"+calculation1);

    }
    public void withAruguments(String username,String password)
    {
        System.out.println("my name is :"+username+"\n my password is :"+password);
    }
    public static int withreturnandAruguments(int a,int b)
    {
        int myvalue1=a;
        int myvalue2=b;
        int addition=myvalue2*myvalue1;
        String mycustomername="Aarthi";
        return addition;
    }
}
