package FundamentalJava.ConsoleApplication;

public class ThreadExecution
{
    public static void main(String[] args) {

        CreditCardExecution execute=new CreditCardExecution();
        Thread th1=new Thread(execute,"Pavithra");
        Thread th2=new Thread(execute,"Manojkumar");
        Thread th3=new Thread(execute,"Swathy");

        th1.start();
        th2.start();
        th3.start();

    }
}
