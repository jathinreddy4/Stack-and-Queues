import java.util.*;
class stack
{
    int top  = -1;
    int n = 10;
    int arr[] = new int[n];
    void push()
    {
        Scanner obj = new Scanner(System.in);
        if(top == n-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            System.out.println("Enter data");
            int i = obj.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("element inserted");
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Underflow / empty");
        }
        else
        {
           top = top -1;
           System.out.println("element deleted"); 
        }
    }
    void display()
    {
        System.out.println("Stack elements : ");
        for(int j = top; j>=0; j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
public class stackusingArray
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        stack st = new stack();
            
        int l;
        do
        {
            System.out.println("enter 1 to push");
            System.out.println("enter 2 pop");
            System.out.println("enter 3 to display");
            int choice = obj.nextInt();
            switch(choice)
            {
                case 1 : st.push();
                break;

                case 2 : st.pop();
                break;

                case 3 : st.display();
                break;
            }
            System.out.println("enter 0 to return to main menu");
            l = obj.nextInt();

        }
        while(l == 0);
        {
            System.out.println("Exited");
        }

        
        
    }

}