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

    public String readfirst()
    {
        if(head==-1)
        {
            return "NOTHING";
        }
        else {
            return Listofitem[0];
        }
    }

    public String readlast()
    {
        if(head==-1)
        {
            return "nothing";
        }
        else
        {
            return Listofitem[head];
        }
    }

    public String readWAnyone(int pos)
    {
        if(head==-1|| head<pos)
        {
            System.out.println(" Position value is wrong or else empty list of item");
            return "/0";
        }
        else
        {
            return  Listofitem[pos];
        }
    }

    public String getTop()
    {
        return Listofitem[head];
    }
    public void clear()
    {
        Arrays.fill(Listofitem,null);
        head=-1;
    }

    public void removefirst()
    {
        if(head==-1)
        {
            System.out.println(" your memory is empty");
        }
        else {
            String old=Listofitem[0];
            int dummy=1;
            while(dummy<=head)
            {
                Listofitem[dummy-1]=Listofitem[dummy];
                dummy++;
            }
            head--;
            System.out.println(old+" has been deleted successfully in first position");
        }
    }

    public void removeLast()
    {
        if(head==-1)
        {
            System.out.println("Nothing to remove at last since list is underflow");
        }
        else
        {
            head=head-1;
            System.out.println(Listofitem[head+1]+" has been deleted last position");
        }
    }

    public void removeAtIndex(int pos)
    {
        if(head==-1)
        {
            System.out.println("Nothing to remove at last since list is underflow");
        }
        else {
            String old=Listofitem[pos];
            int dummy=pos+1;
            while(dummy<=head)
            {
                Listofitem[dummy+1]=Listofitem[dummy];
                dummy++;
            }
            head--;
            System.out.println(old+" in this value is deleted at "+pos);
        }
    }
    private int head=-1;//global variable
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

        System.out.println("first position value is "+lla.readfirst());
        System.out.println("last position name is :"+lla.readlast());
        System.out.println(lla.readWAnyone(2));
        lla.clear();
        System.out.println(Arrays.toString(lla.Listofitem));
        lla.Addbegin("Manoj");
        lla.AddLast("Annamalai");
        lla.Addbegin("Razak");
        lla.Addbegin("Haritha");
        lla.Addbegin("Pavithra");
        System.out.println(Arrays.toString(lla.Listofitem));
//        System.out.println(lla.getTop());

        lla.removefirst();
        System.out.println(Arrays.toString(lla.Listofitem));
        lla.removeLast();
        System.out.println(Arrays.toString(lla.Listofitem));
        lla.removeAtIndex(3);
        System.out.println(Arrays.toString(lla.Listofitem));
    }
}
