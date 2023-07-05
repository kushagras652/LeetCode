class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 1 && nums[0] == 1) return 1;
        int left=0;
        int right=0;
        int max=0;
        int count=0;
        while(right<nums.length){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            max=Math.max(max,right-left);
            right++;
        }
        return max;
    }
}