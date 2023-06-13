package FundamentalJava.Thread;

public class BasicExecution
{
    public static void main(String[] args) throws InterruptedException
    {
        Flower1 flo=new Flower1();
        flo.start();
        flo.join();
        Flower2 flo2=new Flower2();

        Thread th1=new Thread(flo2);

        th1.start();

        System.out.println("Welcome to everyone");

    }

}

class Flower1 extends Thread
{
    public void run()
    {
        for(int poo=1;poo<=5;poo++)
        {
            System.out.println("how much flowers you are sale it ? count :"+poo);
            System.out.println(username());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String username()
    {
        String user="Manoj";
        return user;
    }
}


class Flower2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Rose is symbol of Love");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ie)
            {

            }
        }
    }
}