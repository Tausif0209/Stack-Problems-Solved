import java.util.Stack;
public class NextGreaterElement2 {
  public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
         while(!st.isEmpty() && nums[i]>nums[st.peek()]) ans[st.pop()]=nums[i];
         st.push(i);
        }
        for(int i=0;i<nums.length;i++){
            while(nums[i]>nums[st.peek()]) ans[st.pop()]=nums[i];
        }
        while(!st.isEmpty()) ans[st.pop()]=-1;
        return ans;
    }
}
