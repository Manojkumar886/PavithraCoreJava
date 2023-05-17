package FundamentalJava.OOPS.Interface;

import java.util.Arrays;
import java.util.Scanner;

public class Connection implements CrudlExecution
{
    public void Add()
    {
        Scanner scan=new Scanner(System.in);
        int [] sections=new int[5];

//        sections[4]='J';
//
//        System.out.println(Arrays.toString(sections));

        for(int mypos=0;mypos< sections.length;mypos++)
        {
            System.out.println("what is your favoriate number");
            sections[mypos]=scan.nextInt();
        }

        for(int section1:sections)
        {
            System.out.println(section1);
        }
    }
    public void Update()
    {
        String brands[]={"Oppo","Redmi","Vivo","Apple","Oneplus","IQ07","Nokia","Samsung","Realme"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Before Updating Mobile Brands"+ Arrays.toString(brands));
        System.out.println("which index of value you want replace");
        int index=scan.nextInt();
        System.out.println("Please enter your new mobile brand name");
        String newBrand=scan.next();
        brands[index]=newBrand;//updating
        System.out.println("After updating mobile brands");
        for(String newbrands:brands)
        {
            System.out.print((newbrands)+",");
        }
    }

    public static void main(String[] args) {
        Connection connect=new Connection();
        connect.Add();
        connect.Update();
    }
}
