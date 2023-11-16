package FundamentalJava.SearchingInDS;

import java.util.Scanner;

public class LinearSearch
{
    public static  int LINEARSEARCH(String [] Flowersname,String fav)
    {
        for(int i=0;i<Flowersname.length;i++)
        {
            if (Flowersname[i].equalsIgnoreCase(fav))
            {
                return i;
            }
        }

        return  -1;
    }
    public static void main(String[] args)
    {
        String [] GirlsFav ={ "Jasmine","Lotus","Lily","Rose","sunflower","Mariglod","Tulip"};
        Scanner scan=new Scanner(System.in);
        System.out.println(" What is your favoriate flower name");
        String favflower=scan.next();
        int pos= LINEARSEARCH(GirlsFav,favflower);
       if(pos==-1)
       {
           System.out.println(favflower+"element is not founded in my flower list");
       }
       else
       {
           System.out.println(favflower+" this element is founded at @"+pos);
       }


    }
}
