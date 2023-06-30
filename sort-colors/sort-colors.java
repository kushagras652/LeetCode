class Solution {
    public void sortColors(int[] nums) {
        int max=getMax(nums);
        int[] count=new int[max+1];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        int[] sorted=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            int index=count[num]-1;

            sorted[index]=num;
            count[num]--;
        }
        System.arraycopy(sorted,0,nums,0,nums.length);
    }
    private int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}