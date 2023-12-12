package FundamentalJava.DataStructure;

import javax.crypto.spec.PSource;

public class LinkedListObject
{
    private class Node
    {
        String data;
        Node connect;
        public Node(String data)
        {
            this.data=data;
            connect=null;
        }
    }
    private Node head;
    public LinkedListObject()
    {
        head=null;
    }

    public static void main(String[] args)
    {
        LinkedListObject linkedlist=new LinkedListObject();
        linkedlist.add(" Manoj");
        linkedlist.add("Annamalai");
        linkedlist.addFirst("Razak");
        Node receiver= linkedlist.binarysearch("Annamalai", linkedlist.head);
        System.out.println(receiver.data+"right connect value  :"+receiver.connect.data);
    }
//    add /assLast
    public void add(String obj)
    {
        Node userNode=new Node(obj);

        if(head==null)
        {
            head=userNode;
            System.out.println(obj+" has been inserted successfully");
        }
        else
        {
            Node manage=head;
            while (manage.connect!=null)
            {
                manage=manage.connect;
            }
            manage.connect=userNode;
            System.out.println(obj+" has been added at Last postion");
        }
    }

//    addFirst
    public void addFirst(String obj)
    {
        Node userNode=new Node(obj);

        if(head==null)
        {
            System.out.println(" head is null,so"+obj +" value is added first position");
        }
        else
        {
            System.out.println(obj+" has been added in begnining");
            userNode.connect=head;
        }
        head=userNode;
    }

//    Traverse
    public void traverse()
    {
//          head  con
//        [razak ,manoj ,annamalai ,null]
        Node manage=head;
        while (manage!=null)
        {
            System.out.println(manage.data);
            manage=manage.connect;
        }
    }

//    Remove/RemoveFirst
    public void Remove()
    {
        if(head==null)
        {
            System.out.println("list is underflow,so cant perform deletion");
        }
        else
        {
            head=head.connect;
            System.out.println(" remove has done @ beginning position");
        }
    }

//    Remove Last
    public void RemoveLast()
    {
        if(head==null)
        {
            System.out.println(" cant perform deletion@ last");
        }
        else
        {
            Node manage=head;
            while (manage.connect.connect!=null) {
                manage = manage.connect;
            }
            manage.connect=null;
            System.out.println(" delete at last position");
        }
    }

//    ReadBegin
    public void ReadFirst()
    {
        if(head==null)
        {
            System.out.println(" nothing to read");
        }
        else
        {
            System.out.println(head.data+" in this data @ 1st position");
        }
    }

//    ReadLast
    public void readLast()
    {
        if(head==null)
        {
            System.out.println(" nothing to read");
        }
        else
        {
            Node manage=head;
            while (manage.connect!=null)
            {
                manage=manage.connect;
            }
            System.out.println(manage.data+" in this data");
        }
    }
//     find MID value
    public Node findMid(Node start,Node end)
    {
        if(start==null)
            return  null;
            Node data1=start;
            Node connect1=start.connect;
            while (connect1!=end)
            {
                connect1=connect1.connect;
                if(connect1!=end)
                {
                    data1=data1.connect;
                    connect1=connect1.connect;
                }
            }
            return data1;
    }
//    Binarysearch
    public Node binarysearch(String user, Node current)
    {
        Node start=current;
        Node end=null;
        do
        {
            Node midnode=findMid(start,end);
            if(midnode==null)
                return  null;
            else if (midnode.data.equals(user))
            {
                return midnode;
            }
            else if(midnode.data.compareTo(user)>0)
            {
                end=midnode;
            }
            else
            {
                start=midnode.connect;
            }
        }
        while (end==null || start!=end);

        return  null;
    }
}
