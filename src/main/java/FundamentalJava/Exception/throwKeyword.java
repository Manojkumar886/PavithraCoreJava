package FundamentalJava.Exception;

public class throwKeyword
{

    public static void ExecutionWays()
    {
        try
        {
            throw new NullPointerException();

        }
        catch (NullPointerException npe)
        {
            System.out.println("Method exeception working.....!");
            throw npe;
        }
    }
    public static void main(String[] args)
    {
        try
        {
            ExecutionWays();
        }
        catch (NullPointerException npe)
        {
            System.out.println("main thread will be executing");
        }
    }
}
