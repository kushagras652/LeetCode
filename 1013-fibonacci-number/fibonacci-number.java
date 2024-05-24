class Solution {
    public int fib(int n) {
        if(n==0)
        return 0;
        // if(n==0||n==1){
        //     return n;
        // }
        //  return fib(n-1)+fib(n-2);


        //MEMOIZATION APPROACH
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);

        // return dp1(n,dp);

        //TABLUTAION APPROACH
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=0;
        // dp[1]=1;

        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        //SPACE OPTIMIZATION
        int prev2=0;
        int prev=1;
       // int curri=0;

        for(int i=2;i<=n;i++){
           int  curri=prev+prev2;
            prev2=prev;
            prev=curri;
        }
        return prev;
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