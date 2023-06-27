class Solution {
    public int singleNumber(int[] nums) {
           if(nums.length==1){
            return nums[0];
        }
      Arrays.sort(nums);
      int required=nums[0];
        int count=1;
        int i=0;
      while(i<nums.length-1){
        
          if(nums[i]!=nums[i+1] && count==1){
              return nums[i];
          }
          else{
              i=i+2;
              count++;
              if(count==2){
                  count=1;
              }
          }
      }
      return nums[nums.length-1];
    }
}