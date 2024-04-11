import java.util.*;
class QueUSeLL 
{
    LinkedList<Integer> ls = new LinkedList<>();
    Scanner obj = new Scanner(System.in);

    public void enqueue()
    {
        if(ls.isEmpty())
        {
            System.out.println("enter the data");
            ls.addFirst(obj.nextInt());
        }
        else
        {
            System.out.println("enter ");
            ls.addLast(obj.nextInt());
        }
    }

    public void dequeue()
    {
        if(ls.isEmpty())
        {
            System.out.println("queue is empty");
        }
        else
        {
            ls.removeFirst();
        }
    }

    public void display()
    {
        if(ls.isEmpty())
        {
            System.out.println("Queue is emopty");
        }
        else
        {
            for(int i : ls)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}


public class QueueUsingLL 
{
    public static void main(String[] args) 
    {
        QueUSeLL q = new QueUSeLL();
        Scanner sc = new Scanner(System.in);
        int l;
        do
        {
            System.out.println("Enter \n 1.Enqueue \n 2. Dequeue \n 3. Display");
            int choice  = sc.nextInt();
            switch(choice)
            {
                case 1 : q.enqueue();
                break;
                case 2 : q.dequeue();
                break;
                case 3 : q.display();;
                break;
            }
            System.out.println("ENter 0 to return to main menu");
            l = sc.nextInt(); 
        }
        while(l == 0);
        {
            System.out.println("exited");
        }
    }
}
