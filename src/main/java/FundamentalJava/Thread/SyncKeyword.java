package FundamentalJava.Thread;

public class SyncKeyword
{
    public static void main(String[] args)
    {
        MultiProcessofsinglemethod multi=new MultiProcessofsinglemethod();

        Thread th=new Thread()
        {
          public void run()
          {
              multi.Tables(5);
          }
        };

        Thread th1=new Thread()
        {
            public void run()
            {
                multi.Tables(7);
            }
        };

        th.start();
        th1.start();
    }
}

class MultiProcessofsinglemethod
{
   synchronized public void Tables(int add)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(add+"X"+i+"="+(add*i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}