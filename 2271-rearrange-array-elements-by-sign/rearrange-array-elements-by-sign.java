class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=1;
        int[] arr=new int[nums.length];
        for(int elem:nums){
            if(elem>0){
                arr[i]=elem;
                i=i+2;
            }
            else{
                arr[j]=elem;
                j=j+2;
            }
        }
        return arr;
    }
}