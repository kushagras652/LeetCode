class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1)
        return 1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxI=0;
        int minI=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxI=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minI=i;
            }
        }
        return Math.min(Math.max(maxI+1,minI+1),Math.min(Math.max(nums.length - maxI, nums.length - minI),Math.min(minI+1 + nums.length - maxI, maxI+1 +nums.length - minI))); 
    }
}