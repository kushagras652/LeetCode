class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int even=0;
        int odd=nums.length-1;
        for(int elem:nums){
            if(elem%2==0){
                arr[even]=elem;
                even++;
            }
            else{
                arr[odd]=elem;
                odd--;
            }
        }
        return arr;
    }
}