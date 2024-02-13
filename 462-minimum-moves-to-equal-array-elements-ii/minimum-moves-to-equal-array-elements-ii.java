class Solution {
    public int minMoves2(int[] nums) {
        // int count=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        // int sum=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]!=nums[j]){
        //             sum+=Math.abs(nums[i]-nums[j]);
        //         }
        //     }
        //     count=Math.min(count,sum);
        // }
        // return count;
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int a=0;
        for(int num:nums){
            a+=Math.abs(num-median);
        }
        return a;
    }
}