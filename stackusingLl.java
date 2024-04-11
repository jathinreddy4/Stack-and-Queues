import java.util.*;

class stusell
{
    LinkedList<Integer> ls = new LinkedList<>();
    Scanner obj = new Scanner(System.in);

    public void push()
    {
        if(ls.isEmpty())
        {
            System.out.println("Enter the number");
            ls.addFirst(obj.nextInt());
        }
        else
        {
            System.out.println("enter");
            ls.addFirst(obj.nextInt());
        }
    }

    public void pop()
    {
        if(ls.isEmpty())
        {
            System.out.println("The stack is empty");
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
            System.out.println("stack is empty");
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
public class stackusingLl
{
    public static void main(String[] args) 
    {
        stusell st = new stusell();
        Scanner ob = new Scanner(System.in);   
        int l;
        do 
        {
            System.out.println("Enter \n 1.Push \n 2. Pop \n 3.display");
            int choice = ob.nextInt();
            switch(choice)
            {
                case 1 : st.push();
                break;

                case 2 : st.pop();
                break;

                case 3 : st.display();
                break;
            }
            System.out.println("Enter 0 to return to main menu");
            l = ob.nextInt();
        }
        while(l == 0);
        {
            System.out.println("Exited");
        }
    }


}
