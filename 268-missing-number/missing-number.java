class Solution {
    public int missingNumber(int[] nums) {


        //BRUTE FORCE APPROACH
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i)
        //     return i;
        // }
        // return nums.length;


        //BETTER APPROACH
        // int n=nums.length;
        // int sum=(n*(n+1))/2;
        // int sum2=0;
        // for(int elem:nums){
        //     sum2+=elem;
        // }
        // return sum-sum2;

        //OPTIMAL APPROACH
        int xor1=0,xor2=0;
        for(int i=0;i<nums.length;i++){
            xor1=xor1^nums[i];
            xor2=xor2^(i+1);
        }
      //  xor2=xor2^nums.length;
        return xor1^xor2;
    }
}