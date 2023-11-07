package FundamentalJava.DataStructure;

import java.util.Arrays;

public class LinkedlistArray
{
    public void AddwithIndex(int pos,String data)
    {
        if(head==-1)
        {
            Listofitem[0]=data;
            head++;
        }
        else if (pos<=Listofitem.length-2)
        {
            int dummy=head;

            while(dummy>=pos)
            {
                Listofitem[dummy+1]=Listofitem[dummy];
                dummy--;
            }
            Listofitem[pos]=data;
            head++;
            System.out.println(data+" has inserted in linked list @ "+pos);
        }
        else {
            System.out.println("Invalid Position");
        }
    }
    public void AddLast(String data)
    {
        if(head==-1)
        {
            Listofitem[0]=data;
            head++;
        }
        else
        {
            Listofitem[head+1]=data;
            head++;
        }
        System.out.println(data+" added @ Last Position");
    }
    public void Addbegin(String data)
    {
        if(head==-1)
        {
            Listofitem[0]=data;
            head++;
        }
        else
        {
            int dummy=head;
            if(dummy+1<=Listofitem.length-1)
            {
                while(dummy>=0)
                {
                        Listofitem[dummy+1]=Listofitem[dummy];
                        dummy--;
                }
                Listofitem[0]=data;
                head++;
                System.out.println(data+" has added @ beginning of the linked list");
            }
            else {
                System.out.println("Add @ begin will faild due to overflow");
            }
        }
    }
    private int head=-1;
    private String Listofitem[]=new String[10];
    public static void main(String[] args)
    {


        LinkedlistArray lla=new LinkedlistArray();

        lla.Addbegin("Manoj");
        lla.AddLast("Annamalai");
        lla.Addbegin("Razak");
        lla.Addbegin("Haritha");
        lla.Addbegin("Pavithra");
        lla.AddwithIndex(2,"Geetha");
        lla.AddwithIndex(0,"Swetha");
        System.out.println(Arrays.toString(lla.Listofitem));
    }
}
