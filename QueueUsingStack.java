import java.util.*;

class stackuQu 
{
    Stack<Integer>  st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();
    Scanner obj = new Scanner(System.in);

    public void push()
    {
        int i = obj.nextInt();
        st.push(i);
    }

    public int pop()
    {
       /*while(!st.isEmpty())
       {
            st1.push(st.pop());
       }
       int val = st1.pop();
       while(!st1.isEmpty())
       {
            st.push(st1.pop());
       }
       return val; */

       while(st.size() > 0)
       {
            st1.push(st.pop());
       }
       int val = st1.pop();
       while(st1.size() > 0)
       {
            st.push(st1.pop());
       }
       return val;
    }







    public void display()
    {
        for(int i : st) 
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


}
public class QueueUsingStack {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        stackuQu  s = new  stackuQu();
        
        int l;
        do 
        {
            System.out.println("Enter \n 1.push \n 2.pop \n 3. display");
            int choice  = sc.nextInt();
            switch(choice)
            {
                case 1: s.push();
                break;

                case 2 : s.pop();
                break;

                case 3 : s.display();
                break;    
            }
            System.out.println("Enter 0 to return to main menu");
            l = sc.nextInt();
        }while( l == 0);
        {
            System.out.println("You have exited");
        }
    }
    
}
