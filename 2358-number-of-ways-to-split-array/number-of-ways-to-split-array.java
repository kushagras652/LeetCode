class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefix=new long[nums.length];
            long sum=0;
        for(int i=0;i<nums.length;i++){
            prefix[i]=sum+nums[i];
            sum=prefix[i];
        }
        int count=0;
        for(int i=0;i<prefix.length-1;i++){
            long res=prefix[prefix.length-1]-prefix[i];
            if(res<=prefix[i])
            count++;
        }
        return count;
    }
}