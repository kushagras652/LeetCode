class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return func(n,dp);
    }

    int func(int n,int[] dp){
        if(n==0)
        return 1;

        if(dp[n]!=-1)
        return dp[n];

        int left=func(n-1,dp);
        int right=0;
        if(n>1)
         right=func(n-2,dp);
        return dp[n]=left+right;
    }
}