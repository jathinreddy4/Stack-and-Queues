import java.util.*;

class stUsingQ 
{
    Queue<Integer> q = new LinkedList<>();  
    Scanner obj = new Scanner(System.in);  

    public void push()
    {
        int i = obj.nextInt();
        q.add(i);
    }
    //1,2,3,4

    public int pop()
    {
        for(int i=1; i<=q.size()-1; i++)
        {
            q.add(q.remove());
        }
        int val = q.remove();
        return val;
    }

    public int top()
    {
        for(int i=1; i<=q.size()-1; i++)
        {
            q.add(q.remove());
        }
        int val = q.remove();
        q.add(q.remove());
        return val;   
    }

    public void display()
    {
        for(int i : q)
        {
            System.out.print(i + " ,");
        }
    }

   
}
public class stackUsingQu
{
   public static void main(String[] args) 
   {
    stUsingQ st = new stUsingQ();
    int l;
    do 
    {
        System.out.println("Enter \n 1.push \n 2.pop \n 3. top \n 4. display");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 : st.push();
            break;
            case 2 : st.pop();
            break;
            case 3 : st.top();
            break;
            case 4 : st.display();
            break;
        }
        System.out.println("Enter 0 to return to main menu");
        l = sc.nextInt();
    }
    while(l ==0);
    {
        System.out.println("exited");
    }  
   }
}

