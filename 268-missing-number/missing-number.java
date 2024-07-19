class Solution {
    public int missingNumber(int[] nums) {


        //BRUTE FORCE APPROACH
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i)
        //     return i;
        // }
        // return nums.length;

        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int elem:nums){
            sum2+=elem;
        }
        return sum-sum2;
    }
}