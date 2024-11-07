class Solution {
    public boolean isIdealPermutation(int[] nums) {
        // int global=0,local=0;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         local++;
        //     }
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             global++;
        //         }
        //     }
        // }
        // return global==local?true:false;

         for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i]-i)>1) return false;
        }

        return true;
    }
}