class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean Increasing=true;
        boolean Decreasing=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
            Increasing=false;

            else if(nums[i]>nums[i-1])
            Decreasing=false;

           if (!Increasing && !Decreasing)
                break;
        }
        return Increasing || Decreasing;
    }
}