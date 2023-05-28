class Solution {
    public boolean canJump(int[] nums) {
        int maxjump=0;
        int n=nums.length-1;
        for(int i=0;i<=maxjump;i++){
            maxjump=Math.max(maxjump,i+nums[i]);
            if(maxjump>=n){
                return true;
            }
        }
        return false;
    }
}