class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int res=Math.abs(i-start);
                if(min>res)
                min=res;
            }
            
        }
        return min;
    }
}