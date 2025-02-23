
class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==1){
            list.add(-1);
            return list;
        }
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty()&&arr[i]>arr[st.peek()])
            {
                ans[st.pop()]=arr[i];
            }
            st.add(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()]=-1;
        }
        for(int num:ans)
        {
            list.add(num);
        }
         return list;
    }
}