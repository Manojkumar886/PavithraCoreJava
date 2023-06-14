package FundamentalJava.Thread;

public class Threadmethods implements Runnable
{

    @Override
    public void run()
    {
        whileloop();
        System.out.println(Thread.currentThread().getName()+" Thread is using");
        System.out.println("your thread id is "+Thread.currentThread().getId());
        System.out.println("your priority number is "+Thread.currentThread().getPriority());

    }
    public void whileloop()
    {
        int i=1;
        do {
            System.out.println("what is your value "+i);
            i--;
        }
        while(i>=-5);
    }

    public static void main(String[] args) throws InterruptedException {
        Threadmethods thmethods=new Threadmethods();
        Thread th1=new Thread(thmethods,"Manojkumar");
        Thread th2=new Thread(thmethods,"Pavithra");
        Thread th3=new Thread(thmethods,"Aarthi");

        th3.setPriority(10);
        th2.setPriority(3);

        th1.start();
        th1.join();
        th2.start();
        th2.join();
       th3.start();
        th3.join();

    }
}
