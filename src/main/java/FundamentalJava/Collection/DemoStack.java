package FundamentalJava.Collection;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args)
    {
        Stack obj=new Stack();
        obj.push(" Manojkumar");
        obj.push(89);
        obj.push(90.0);
        obj.push(true);
        obj.push(9783363783l);
        System.out.println("Original Values"+obj);
        obj.pop();//only deleeted last element
        System.out.println(obj);
        System.out.println(obj.peek());//Top of the element
        System.out.println(obj.search(true));
    }
}
