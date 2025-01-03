class Solution {
    public int pivotIndex(int[] nums) {
        // int[] prefix=new int[nums.length];
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     prefix[i]=sum+nums[i];
        //     sum=prefix[i];
        // }
        // for(int i=0;i<nums.length-1;i++){
        //       int leftSum = (i == 0) ? 0 : prefix[i - 1];
        //     int rightSum = prefix[nums.length - 1] - prefix[i];
            
        //     if (leftSum == rightSum) {
        //         return i;
        //     }
        // }
        // return -1;
        int total=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(right==left)
            return i;

            left+=nums[i];
        }
        return -1;
    }
}