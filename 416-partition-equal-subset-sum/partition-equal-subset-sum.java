class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int elem:nums){
            sum+=elem;
        }
        if(sum%2!=0)
        return false;
        int n=nums.length;

        int[][] dp = new int[n][sum/2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return func1(n-1,sum/2,nums,dp);

    }
    boolean func1(int index,int target,int [] nums,int[][] dp){
        if(target==0)
        return true;

        if(index==0)
        return (target==nums[0]);

        if(dp[index][target]!=-1)
        return dp[index][target]==0?false:true;

        boolean nottaken=func1(index-1,target,nums,dp);
        boolean taken=false;
         if (target >= nums[index])
        taken=func1(index-1,target-nums[index],nums,dp);

         dp[index][target]=(taken||nottaken)?1:0;

         return taken||nottaken;
    }
}