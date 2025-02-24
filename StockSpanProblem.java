class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
       ArrayList<Integer> list=new ArrayList<>();
       if(arr.length==1)
       {
           list.add(1);
           return list;
       }
       int[] span=new int[arr.length];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<arr.length;i++)
       {
           int count=1;
           while(!st.isEmpty()&&arr[i]>=arr[st.peek()]){
               count+=span[st.pop()];
           }
           span[i]=count;
           st.add(i);
       }
       for(int el:span)
       {
           list.add(el);
       }
       return list;
    }
}