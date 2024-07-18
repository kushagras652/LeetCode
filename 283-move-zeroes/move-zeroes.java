class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //      if(nums[i]!=0)
        //     break;
        //     if(nums[i]==0){
        //         int temp=nums[i];
        //         nums[i]=nums[nums.length-i-1];
        //         nums[nums.length-i-1]=temp;
        //     }
           
        // }

        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

    }
}