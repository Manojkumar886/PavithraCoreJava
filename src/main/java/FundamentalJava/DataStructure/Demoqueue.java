package FundamentalJava.DataStructure;

public class Demoqueue
{
    public static void main(String[] args)
    {
        Line line=new Line();

        line.enqueue(9.8f);
        line.enqueue(8.9f);
        line.enqueue(6.7f);
        line.enqueue(9.4f);
        line.iterator();
        System.out.println(line.dequeue()+" has deleted successfully");
        line.iterator();
        System.out.println(line.readRear()+" last value in my queue");
        System.out.println(line.readFront()+" first value in my quque");
        System.out.println(line.rearPostion(1)+" in this value position @ 1");
    }
}

class Line
{
    private float [] arr;
    private int front=-1,rear=-1;
    public Line()   //Constructor
    {
        arr=new float[10];
    }

    public void iterator()
    {
        System.out.println(" Iterating all the queue elements....!\n");
        int dummy=front;
        while(dummy<=rear)
        {
            System.out.println(arr[dummy]);
            dummy++;
        }
    }

    public void enqueue(float data)
    {
        if(front==-1)
        {
            System.out.println("Queue is underflow");
            front++;
            arr[front]=data;
            rear=front;
            System.out.println(data+" has enqueued successfully @"+front+" end @"+rear);
        }
        else if(rear==arr.length-1)
        {
            System.out.println(" Queue is Overflow");
        }
        else
        {
            int dummy=rear;
            while(dummy>=front)
            {
                arr[dummy+1] =arr[dummy];
                dummy--;
            }
            arr[front]=data;
            rear++;
            System.out.println(data+" has enqueued successfully @"+front+" end @"+rear);
        }
    }

    public float dequeue()
    {
        if(rear==-1)
        {
            System.out.println(" queue is underflow");
            return -1;
        }
        else
        {
            rear--;  //rear=5
            return arr[rear+1];
        }
    }

    public float readRear()
    {
        return arr[rear];
    }
    public float readFront()
    {
        return arr[front];
    }
    public float rearPostion(int pos)
    {
        if(pos>=front && pos<=rear)
        {
            return arr[pos];
        }
        else
        {
            return 0.0f;
        }
    }
}
