class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
       
       //ITS SHOWING TLE FIND ANOTHER METHOD


        // long count=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum=nums[i]+nums[j];
        //     if((sum>=lower) && (sum<=upper)){
        //         count++;
        //     }
        //     }
        // }
        // return count;
         Arrays.sort(nums);
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + binarySearch1(nums, nums[i], i, lower, upper) - binarySearch2(nums, nums[i], i, lower, upper);
        }
        return result;
    }
    public long binarySearch1(int[] nums, int currentValue, int index, int lower, int upper) {
        int start = index + 1;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > (upper - currentValue)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
     public long binarySearch2(int[] nums, int currentValue, int index, int lower, int upper) {
        int start = index + 1;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < (lower - currentValue)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
