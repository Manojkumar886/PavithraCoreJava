package FundamentalJava.Exception;

import java.io.IOException;

public class CompileTimeException
{
    public static void main(String[] args) throws IOException,InterruptedException
    {
        Runtime run=Runtime.getRuntime();

        Process pro;

        pro=run.exec("notepad");
        Thread.sleep(5000);
        pro=run.exec("mspaint");

    }
}

//class Runtime
//{
//    Runtime()
//    {
//
//    }
//
//   private static Runtime run=new Runtime();//Initialize an object-call to constructor
//
//  static  Runtime getRuntime()
//    {
//      return run;
//    }
//}
