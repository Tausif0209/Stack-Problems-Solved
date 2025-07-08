import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class NextElementWithGreaterFrequency {
  public ArrayList<Integer> findGreater(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int el:arr) map.put(el,map.getOrDefault(el,0)+1);
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && map.get(arr[i])>map.get(arr[st.peek()])) arr[st.pop()]=arr[i];
           st.push(i);
       }
       while(!st.isEmpty()) arr[st.pop()]=-1;
       ArrayList<Integer> list=new ArrayList<>();
       for(int el:arr) list.add(el);
       return list;
    }
}
