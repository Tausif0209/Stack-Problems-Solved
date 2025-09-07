import java.util.Stack;

public class ValidParantheses {
  public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else if(st.isEmpty() || ((ch==')' && st.peek()!='('
            ) ||  (ch=='}' && st.peek()!='{'
            ) || (ch==']' && st.peek()!='['
            ))) return false;
            else st.pop();
        } return st.isEmpty();
    }
}
