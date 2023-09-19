class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        // int start=0;
        // int end=nums.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]==nums[mid+1] || nums[mid]==nums[mid-1]){
        //         return nums[mid];
        //     }
        // }
    //     int i=0;
    //     while(i<nums.length){
    //          if(nums[i]!=nums[i+1]){
    //         i++;
    //     }
    //     if(nums[i]==nums[i+1]){
    //         return nums[i];
    //     }
    //     }
    //    return -1;
    int i=1;
    while(i<nums.length){
        if(nums[i]!=nums[i-1]){
            i++;
        }
        else{
            return nums[i];
        }
    }
    return 0;
    }
}