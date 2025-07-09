import java.util.Stack;

public class SumOfSubarrayMinimum {
  public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] nextSmallerIndex=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]) nextSmallerIndex[st.pop()]=i;
            st.push(i);
        }
        while(!st.isEmpty()) nextSmallerIndex[st.pop()]=arr.length;
        int[] right=new int[arr.length+1]; //Number of element smaller from current element
        int mod=(int)1e9 + 7;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            int count= (nextSmallerIndex[i]-i)*(right[i]+1);
            sum= (sum + ((1L*count*arr[i])%mod))%mod;
            right[nextSmallerIndex[i]]+=(right[i]+1);
        } return (int)sum;
    }
}
