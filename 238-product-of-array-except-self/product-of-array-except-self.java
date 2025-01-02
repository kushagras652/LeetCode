class Solution {
    public int[] productExceptSelf(int[] nums) {
        // its showing TLE
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int a=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(j==i)
        //         continue;
        //          a=a*nums[j];
        //     }
        //     arr[i]=a;
        // }
        // return arr;




        //PROBLEM WITH THIS APPROACH IS THAT DIVISION BY ZERO IS NOT POSSIBLE
        // int[] arr=new int[nums.length];
        // int pro=1;
        // for(int elem:nums){
        //     pro*=elem;
        // }
        // for(int i=0;i<nums.length;i++){
        //      arr[i] = (int) (pro / (double) nums[i]);
        // }
        // return arr;

        int[] prefix=new int[nums.length];
        int[] postfix=new int[nums.length];

        prefix[0]=nums[0];
        postfix[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]*prefix[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            postfix[i]=nums[i]*postfix[i+1];
        }

        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if (i == 0) {
        arr[i] = postfix[i + 1]; 
    } else if (i == nums.length - 1) {
        arr[i] = prefix[i - 1]; 
    } else {
        arr[i] = prefix[i - 1] * postfix[i + 1]; 
    }
        }

        return arr;
    }
}