class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums2.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums2.length;i++)
        {
            while(!st.isEmpty()&&nums2[i]>nums2[st.peek()])
            {
                ans[st.pop()]=nums2[i];
            }
            st.add(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()]=-1;
        }
         for(int i=0;i<nums1.length;i++)
         {
           nums1[i]=ans[map.get(nums1[i])];
         }
         return nums1;
    }
}