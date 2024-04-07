import java.util.*;
class queue 
{
    int f = -1, r = -1; //f= fornt & r = rear
    int n = 4;
    int arr[] = new int[n];

    void enqueue()
    {
        Scanner obj = new Scanner(System.in);
        if(r == n-1)
        {
            System.out.println("Queue overflow");
        }
        else 
        {
            if(f== -1 && r== -1)
            {
                System.out.println("enter data to enter in queue");
                int i = obj.nextInt();
                f = 0;
                r = 0;
                arr[r] = i;
            }
            else
            {
                System.out.println("enter data to enter in queue");
                int i = obj.nextInt();
                r++;
                arr[r] = i;
            }
        }

    }

    void dequeue()
    {
        if(f == -1 && r ==-1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            f = f+1;
        }
    }

    void display()
    {
        for(int i = f; i<=r; i++)
        {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

}


public class QueueUsingArray 
{
    public static void main(String[] args) 
    {
        queue q = new queue();
        System.out.println("This is a queue");
        Scanner ob = new Scanner(System.in);
        int l;
        do 
        {
            System.out.println("Enter to \n 1. Enqueue \n 2.Dequeue \n 3.Display");
            int choice = ob.nextInt();

            switch(choice)
                {
                    case 1 : q.enqueue();
                    break;
    
                    case 2 : q.dequeue();
                    break;
    
                    case 3 : q.display();
                }
                System.out.println("enter 0 to return to menu");
                l = ob.nextInt();

        }    
        while(l == 0);
        {
            System.out.println("exited");
        }
       
    }    
}
