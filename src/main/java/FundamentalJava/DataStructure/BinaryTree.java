package FundamentalJava.DataStructure;

import java.util.Arrays;

public class BinaryTree extends BTree
{
    public static void main(String[] args)
    {
       BinaryTree tree=new BinaryTree();
       tree.setRoot("Manojkumar");
       tree.setLeft("Haritha",0);
       tree.setRight("Pavithra",0);
       tree.setLeft("Kavitha",1);
       tree.setRight("Hema",1);

       tree.traverse();
        System.out.println("pre order traverse");
        tree.preOrder(0);
        System.out.println("In order traverse");
        tree.inOrder(0);
        System.out.println("Post Order Traverse");
        tree.postOrder(0);
        tree.callBFS();
    }
}


class BTree
{
    private String arr[];

    public BTree()
    {
        arr=new String[10];
    }

    public void setRoot(String data)
    {
        arr[0]=data;
    }

    public void setLeft(String data,int root)
    {
        if(arr[root]==null || root> arr.length)
            return;
        else
        {
            int temp=root*2+1;
            arr[temp]=data;
        }
    }

    public void  setRight(String data,int root)
    {
        if(arr[root]==null || root> arr.length)
            return;
        else
        {
            int temp=root*2+2;
            arr[temp]=data;
        }
    }
    public void traverse()
    {
        System.out.println(Arrays.toString(arr));
    }

    public void preOrder(int root)
    {
        if(root>=arr.length||arr[root]==null)
            return;
        else {
            System.out.print(arr[root]+" - ");
            preOrder(root*2+1);
            preOrder(root*2+2);
        }
    }

    public void inOrder(int root)
    {
        if(root>=arr.length||arr[root]==null)
            return;
        else {
            preOrder(root*2+1);
            System.out.print(arr[root]+" - ");
            preOrder(root*2+2);
        }
    }

    public void postOrder(int root)
    {
        if(root>=arr.length||arr[root]==null)
            return;
        else {
            preOrder(root*2+1);
            preOrder(root*2+2);
            System.out.print(arr[root]+" - ");
        }
    }

    public void callBFS()
    {
        System.out.println("BFS Traversal");
        int ht=seekHeight(0);
        for(int ind=1;ind<=ht;ind++)
            bfsTraverse(0, ind);
        System.out.println();
    }

    private void bfsTraverse(int root,int level)
    {
        if(root>=arr.length||arr[root]==null)
            return;
        else if(level==1)
            System.out.print(arr[root]+" ");
        else {
            bfsTraverse(root*2+1, level-1);// level-=1 or level-- level=level-1
            bfsTraverse(root*2+2, level-1);
        }
    }

    private int seekHeight(int root)
    {
        if(root>=arr.length||arr[root]==null)
            return 0;
        else {
            int left=seekHeight(root*2+1);
            int right=seekHeight(root*2+2);

            if(left>right)
                return left+1;
            else
                return right+1;
        }
    }
}