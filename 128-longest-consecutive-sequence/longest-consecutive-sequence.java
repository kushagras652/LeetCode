class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int elem:nums){
            pq.add(elem);
        }
       int ans=1;
       int count=1;
       int prev=pq.poll();
       while(!pq.isEmpty()){
        int present=pq.poll();
        if(prev==present){
            continue;
        }
        else if(Math.abs(prev-present)==1){
            count++;
            ans=Math.max(ans,count);
            prev=present;
        }
        else
        {
            count=1;
            prev=present;
        }
       }
       return ans;
    }
}