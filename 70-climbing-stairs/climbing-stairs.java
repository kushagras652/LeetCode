class Solution {
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);

       return dp1(n,dp);

    //    dp[0]=1;
    //    dp[1]=1;

    //    for(int i=2;i<=n;i++){
    //     dp[i]=dp[i-1]+dp[i-2];
    //    }
    //     return dp[n];
    }

    public int dp1(int n,int[] dp){
         if(n==1)
        return 1;

        if(n==0)
        return 1;

        if(dp[n]!=-1)
        return dp[n];

        dp[n]=dp1(n-1,dp)+dp1(n-2,dp);

        return dp[n];
    }
}