class Solution {
    public int minimumDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int left=i+1;
        //     int right=nums.length-1;
        //     while(left<right){
        //         int sum=0;
        //         if(nums[i]==nums[left] && nums[left]==nums[right] && nums[right]==nums[i]){
        //             sum=Math.abs(i-left)+Math.abs(left-right)+Math.abs(right-i);
        //             min=Math.min(sum,min);
        //         }
        //         left++;
        //         right--;
        //     }
        // }
        // if(min==Integer.MAX_VALUE)
        // return -1;
        // return min;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k] && nums[k]==nums[i]){
                    int sum=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                    min=Math.min(min,sum);
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;
    }
}