package FundamentalJava.SearchingInDS;

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] Favno={6,16,26,36,46,56,66,76,86,96};

        int start=0;
        int end=Favno.length;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your LuckyNo");
        int luckyno=scan.nextInt();
        BinarySearch search=new BinarySearch();

        int pos=search.BINARYSEARCH(Favno,start,end,luckyno);
        if(pos==-1)
        {
            System.out.println(" not found");
        }
        else
        {
            System.out.println(luckyno+" number is founded @ "+pos);
        }

    }
    public int BINARYSEARCH(int [] array,int start,int end ,int targetvalue)
    {
        if(end>start)
        {
            int mid =(start+end)/2;

            if(array[mid]==targetvalue)
            {
                return mid;
            }
            else if(array[mid]>=targetvalue)
            {
                return BINARYSEARCH(array,0,mid,targetvalue);
            }
            else if(array[mid]<=targetvalue)
            {
                return  BINARYSEARCH(array,mid+1,end,targetvalue);
            }
            else
            {
                return -1;
            }
        }
        else
        {
        return  -1;
        }
    }
}
