package FundamentalJava.Arrays;

public class Xpatterns
{
    public static void main(String[] args)
    {
        String name="program";
        int length=name.length();
        for(int i=0;i<length;i++)
        {
            int j=length-1-i;//7-1-0
            for(int k=0;k<length;k++)
            {
                if (k == i || k == j)
                    System.out.print(name.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
