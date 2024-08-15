class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sum+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        if(sum==sum2)
        return false;

        return true;
    }
}