class Solution {
    public int[] sortArray(int[] nums) {
        int max=getMax(nums);
        int min=getMin(nums);
        int[] count=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]-min]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] sorted=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
           
            int index=count[num-min]-1;

            sorted[index]=num;
            count[num-min]--;
        }
        return sorted;
    }
    private int getMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
     private int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}