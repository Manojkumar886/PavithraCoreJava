package FundamentalJava.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class StackDS
{
    private Object[] storage;
    private int peek;
    public void List()
    {
        System.out.println(Arrays.toString(storage));
    }
    public StackDS()
    {
        storage=new Object[10]; //0-9
        peek=-1;
    }


    public void push(Object obj)
    {
        if(peek==-1)
        {
            peek=0;
            storage[peek]=obj;
            System.out.println(obj+" has added @ "+peek);
        }
        else if(peek==storage.length-1)
        {
            System.out.println("couldn't push due to overflow");
        }
        else
        {
            ++peek;//preincrement 0+=1;peek=1
            storage[peek]=obj;  //storage[1]=obj;
            System.out.println(obj+" has added @ "+peek);
        }
        System.out.println(Arrays.toString(storage));
    }


    public int top()
    {
        return  peek;
    }
    public void traverse()
    {
        int point=peek;
        while(point!=-1)
        {
            System.out.println(storage[point]+" position @ "+point);
            point--;
        }
    }

    public void pop()
    {
        if(peek==-1)
        {
            System.out.println("Stack is underflow");
        }
        else
        {
            System.out.println(storage[peek]+" this is ready to pop");
            storage[peek]=null;
            --peek;
        }
        System.out.println("After deleted values :"+Arrays.toString(storage));
    }

    public void search(Object obj)
    {
        int point=peek;
        while (point!=-1)
        {
            if(storage[point].equals(obj)) {
                System.out.println(storage[point] + " Exits @" + point);
                return;
            }
            point--;
        }
        System.out.println(obj+ "   hasn't available in stack");

    }
    public void clear(){
        storage=new Object[10];
        peek=-1;
    }
    public static void main(String[] args)
    {
        StackDS mystack=new StackDS();
        Scanner scanner=new Scanner(System.in);
        String operation="";Object obj=null;
        System.out.println("------------------Welcome to TODO List--------------");
        do{
            System.out.println("Push\nPop\nTop\nSearch\nClear\nList");
            System.out.println("Tell us what you wish to perform");
            operation= scanner.next();
            switch(operation){
                case "push":
                    System.out.println("Enter the data to push ");
                    obj=scanner.next();
                    mystack.push(obj);
                    break;
                case "pop":
                    mystack.pop();
                    break;
                case "top":
                    System.out.println(mystack.top());
                    break;
                case "search":
                    System.out.println("Enter the data to search ");
                    obj=scanner.next();
                    mystack.search(obj);
                case "clear":
                    mystack.clear();
                    break;
                case "list":
                    mystack.List();
                    break;
                default:return;
            }
        }while(true);

//        mystack.push("Manojkumar");
//        mystack.push(true);
//        mystack.push(22.1);
//        mystack.push(98.9f);
//        mystack.push(90);
//
////        System.out.println(mystack.top());
//        mystack.traverse();
//        mystack.pop();
//        mystack.pop();
//        mystack.search(88);
    }
}
