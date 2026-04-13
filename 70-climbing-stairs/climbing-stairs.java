class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return climb(n,dp);

   
    }
    int climb(int n,int[] dp){
        //  Arrays.fill(dp,-1);

        // dp[1]=1;
        // dp[2]=2;

        // for(int i=3;i<n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }

        // if(dp[n]!=-1)
        // return dp[n];

         if(n<=1)
    return 1;

    if(dp[n]!=-1)
    return dp[n];

    return dp[n]=climb(n-1,dp)+climb(n-2,dp);

        // return dp[n];
    }
}