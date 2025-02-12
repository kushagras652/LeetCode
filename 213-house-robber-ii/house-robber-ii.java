class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        
        int[] arr1=Arrays.copyOfRange(nums,0,n-1);
        int[] arr2=Arrays.copyOfRange(nums,1,n);

        return Math.max(helper(arr1),helper(arr2));
    }

    int helper(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
    }
    int func(int n,int[] nums,int[] dp){
        if(n==0)
        return nums[0];
        if(n<0)
        return 0;

        if(dp[n]!=-1)
        return dp[n];

        int take=nums[n]+func(n-2,nums,dp);
        int not=func(n-1,nums,dp);

        return dp[n]=Math.max(take,not);
    }
}
