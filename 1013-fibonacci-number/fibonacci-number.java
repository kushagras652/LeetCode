class Solution {
    public int fib(int n) {
        // if(n==0||n==1){
        //     return n;
        // }
        //  return fib(n-1)+fib(n-2);

        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return dp1(n,dp);
    }
    public int dp1(int n,int[] dp){
        if(n<=1)
        return n;

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=dp1(n-1,dp) + dp1(n-2,dp);

        return dp[n];
    }
}