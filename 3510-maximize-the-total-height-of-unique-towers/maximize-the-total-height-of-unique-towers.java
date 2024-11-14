class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        long ans=0;
        long curr=Integer.MAX_VALUE;
        for(int i=maximumHeight.length-1;i>=0;i--){
            curr=Math.min(curr,maximumHeight[i]);
            if(curr<=0)
            return -1;

            ans+=curr;
            curr--;
        }
        return ans;
    }
}