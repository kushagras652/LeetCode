class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if((nums[i]==0 && flag) || (nums[i]==1 && !flag)){
                ans++;
                flag=!flag;
            }
        }
        return ans;
    }
}