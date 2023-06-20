package FundamentalJava.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoArrayListandVector
{
    public static void main(String[] args)
    {
//        List<Integer> list=new ArrayList<Integer>();
        ArrayList list1=new ArrayList();
        list1.add("Manojkumar");
        list1.add(21);
        list1.add(165.78);
        list1.add(60);
        list1.add('A');
        list1.add(true);
        list1.add(1,"BCA");

        Vector list2=new Vector();
        list2.addAll(list1);
        list2.add("Pavithra R");
        list2.add(22);
        list2.add("BE CSE");
        System.out.println("My arrayList values"+list1);
        System.out.println("My Vetcor values"+list2);
        System.out.println("my vector value name is "+list2.indexOf("Pavithra R"));
//        list2.retainAll(list1);
//        System.out.println(list1+"---------"+list2);
        list2.removeAll(list1);
        System.out.println(list1+"---------"+list2);
    }
}
