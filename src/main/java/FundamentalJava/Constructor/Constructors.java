package FundamentalJava.Constructor;

public class Constructors
{
    String CrushName;
    int CrushAge;
    public Constructors()//Default-Constructor
    {
        System.out.println("Welcome to Default Constructor");
        System.out.println("my crush name "+CrushName+" and age is "+CrushAge);
    }
    public  Constructors(String mine,int mineAge)//Parameterized Constructor
    {
        CrushName=mine;
        CrushAge=mineAge;
        System.out.println("My crush name"+CrushName+"\n my crush age is"+CrushAge);
    }
    public static void main(String[] args)
    {
        Constructors Default=new Constructors();
        Constructors Aruguments=new Constructors("Haritha",20);

        new Constructors("Vaishali",21);
        new Constructors("Indhu",23);
        Constructors Arguments1=new Constructors("Yuvasri",22);

    }
}
