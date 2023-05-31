class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int[] arr=new int[2];
        Arrays.sort(nums);
        int i=0;
          int j=0;
       while(i<nums.length-1){
           if( nums[i]==nums[i+1]){
               i=i+2;
           }
           else{
               arr[j]=nums[i];
               j++;
               i++;
           }
       }
               if (j < 2 && nums[nums.length - 1] != nums[nums.length - 2]) {
            arr[j] = nums[nums.length - 1];
        }

       return arr;
    }
}