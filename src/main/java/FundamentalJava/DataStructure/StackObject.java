package FundamentalJava.DataStructure;

public class StackObject
{
    private class Pack
    {
        Object data;
        Pack connect;
    }

    private Pack peek;

    public StackObject()
    {
        peek=null;
    }

    public void push(Object content)
    {
        Pack pack=new Pack();
        pack.data=content;
        if(peek==null)
        {
            System.out.println(" Stack is Empty");
            System.out.println(content+" Ready to add in Stack");
        }
        else
        {
            System.out.println(content+" has to pushed "+peek.data);
        }
        pack.connect=peek;
        peek=pack;
    }
    public void  traverse()
    {
        Pack explorer=new Pack();
        explorer=peek;
        while(peek!=null)
        {
            System.out.println(explorer.data+" is current values");
            explorer=explorer.connect;
        }
    }

    public void pop()
    {
        if(peek==null)
        {
            System.out.println("underflow stack,didn't performed by pop");
        }
        else
        {
            Object Lastelement=peek.data;
            peek=peek.connect;
            System.out.println(Lastelement+"has been deleted");
        }
    }
    public void clear()
    {
        peek=null;
        System.out.println("Whole stack is cleared");
    }
    public void top()
    {
        System.out.println("peek of value is "+peek.data);
    }

    public void search(Object obj) {
        int count = 0;
        Pack explorer = new Pack();
        explorer = peek;
        while (explorer != null) {
            count++;
            if (explorer.data.equals(obj)) {
                System.out.println(count + " is the poistion where the " + obj + " exists");
                return;
            }
            explorer = explorer.connect;
        }
        System.out.println(obj + " not exists in the stack");
    }
    public static void main(String[] args)
    {
        StackObject  stkobj=new StackObject();
        stkobj.push("Manoj");
        stkobj.push("Pavithra");
        stkobj.push("Geetha");
        stkobj.pop();
        stkobj.pop();
        stkobj.top();
        stkobj.search("Manoj");
    }
}
