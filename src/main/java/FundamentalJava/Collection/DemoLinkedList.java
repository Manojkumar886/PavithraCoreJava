package FundamentalJava.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
//        add/addLast ,  addFirst, add(index,object), remove/removeFirst, removeLast , remove(index), remove(object),contains-checking process
//			get(index), getFirst, getLast , set(index,object)// update, indexOf(object), clear()..........

        LinkedList list1=new LinkedList();//generic
        list1.add("Manojkumar");
        list1.add(21);
        list1.add(165.78);
        list1.add(60);
        list1.add('A');
        list1.add(true);
        list1.add(1,"BCA");
        list1.remove(3);
        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.set(0,"Manoj"));

        System.out.println(list1);
        list1.clear();
        System.out.println(list1);

        LinkedList<Character> obj=new LinkedList<Character>();
        obj.add('M');
        obj.add('A');
        obj.add('N');
        obj.add('O');
        obj.add('J');
//        System.out.println(obj);

        Iterator it=obj.iterator();


        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
