class Solution {
    public void moveZeroes(int[] nums) {

        //BRUTE FORCE
        // int[] arr=new int[nums.length];
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         arr[j++]=nums[i];
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     nums[i]=arr[i];
        // }

        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)
        return ;

        for(int i=j+1;i<nums.length;i++){

            if(nums[i]!=0){
                int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            j++;
            }
            
        }

    }
}