class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];

            Integer[] dp=new Integer[nums.length];
        int ans=solve(nums,dp,0,nums.length-1);
        Arrays.fill(dp,null);
        ans=Math.max(ans,solve(nums,dp,1,nums.length));
        return ans;
    }
    public int solve(int[] nums,Integer[] dp,int s,int e){
        if(s>=e)
        return 0;

        if(dp[s]!=null){
            return dp[s];
        }

        return dp[s]=Math.max(solve(nums,dp,s+1,e),solve(nums,dp,s+2,e)+nums[s]);
    }
}


// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==1) return nums[0];
//         Integer dp[]=new Integer[nums.length];
//         int ans=sol(nums,dp,0,nums.length-1);
//         Arrays.fill(dp,null);
//         ans=Math.max(ans,sol(nums,dp,1,nums.length));
//         return ans;
//     }
//     public int sol(int[] nums,Integer[] dp,int s,int e){
//         if(s>=e) return 0;
//         if(dp[s]!=null) return dp[s];
//         dp[s]=Math.max(sol(nums,dp,s+1,e),sol(nums,dp,s+2,e)+nums[s]);
//         return dp[s];
//     }
// }