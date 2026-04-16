class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int n=nums.length-1;

        if(n==0)
        return true;

        for(int i=0;i<=n;i++){
            if(i<=max){
                max=Math.max(max,i+nums[i]);
            }

            if(i>max)
            return false;
            if(max>=n)
            return true;
        }
        return false;
    }
}