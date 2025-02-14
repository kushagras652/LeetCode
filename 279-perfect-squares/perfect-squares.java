class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        list.add(i*i);

        int[][] dp=new int[list.size()][n+1];
        for(int[] row:dp)
        Arrays.fill(row,-1);

        return func(list.size()-1,n,dp,list);
    }
    int func(int index,int target,int[][] dp,ArrayList<Integer> list){
        if(target==0)
        return 0;
        if(index==0){
            if(target%list.get(0)==0)
            return target/list.get(0);
            else
            return Integer.MAX_VALUE-1;
        }
      

        if(dp[index][target]!=-1)
        return dp[index][target];

        int notPick=func(index-1,target,dp,list);
        int pick=Integer.MAX_VALUE;
        if(target>=list.get(index))
        pick=1+func(index,target-list.get(index),dp,list);

        return dp[index][target]=Math.min(notPick,pick);
    }
}