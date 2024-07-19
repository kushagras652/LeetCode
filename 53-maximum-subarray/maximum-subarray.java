class Solution {
    public int maxSubArray(int[] nums) {


        int max=Integer.MIN_VALUE;

        //BRUTE FORCE SHOWS TLE
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=nums[k];
        //         }
        //         max=Math.max(max,sum);
        //     }
        // }
        // return max;


        //BIT OPTIMIZED BUT SHOWS TLE
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max=Math.max(max,sum);
        //     }
        // }
        // return max;

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)
            max=sum;

            if(sum<0)
            sum=0;
        }
        return max;
    }
}