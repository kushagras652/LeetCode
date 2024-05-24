class Solution {
    public int rob(int[] arr) {

    //    if(arr.length==0)return 0;
    //     int dp[] = new int[arr.length+1];
    //     dp[0]=0;
    //     dp[1]=arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         dp[i+1]=Math.max(dp[i],dp[i-1]+arr[i]);
    //     }
    //     return dp[arr.length];

        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
    int ans=solve(dp,n-1,arr);
    return ans;
    }

    int solve(int[] dp,int n,int[] arr){
        if(n==0)
        return arr[0];

        if(n<0)
        return 0;

        if(dp[n]!=-1)
        return dp[n];

        int in=arr[n]+solve(dp,n-2,arr);
        int ex=solve(dp,n-1,arr);

        dp[n]=Math.max(in,ex);

        return dp[n];
    }
}