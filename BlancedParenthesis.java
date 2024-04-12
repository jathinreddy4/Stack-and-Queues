import java.util.*;

public class BlancedParenthesis 
{
    public static void main(String[] args) {
        String s = "([{}])";
        Boolean ans = isbalnced(s);
        System.out.println(ans);
    }

    public static boolean isbalnced(String s)
    {
        Stack<Character> st = new  Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                st.push(')');
            }
            else if (c == '[')
            {
                st.push(']');
            }
            else if(c == '{')
            {
                st.push('}');
            }

            else if(st.isEmpty() || st.pop() != c)
            {
                return false;
            }

            

        }return true;
    }
    
    

    
}
