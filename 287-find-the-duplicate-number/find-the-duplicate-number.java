class Solution {
    public int findDuplicate(int[] nums) {
      //  Arrays.sort(nums);
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




    // int i=1;
    // while(i<nums.length){
    //     if(nums[i]!=nums[i-1]){
    //         i++;
    //     }
    //     else{
    //         return nums[i];
    //     }
    // }
    // return 0;

    // for(int i=0;i<nums.length-1;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j])
    //         return nums[i];
    //     }
    // }
    // return -1;

    // Set<Integer> set=new HashSet<>();
    // for(int elem:nums){
    //     if(set.contains(elem))
    //     return elem;
    //     else{
    //         set.add(elem);
    //     }
    // }
    // return -1;


    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return nums[i];
        }
    }
    return -1;
    }
}