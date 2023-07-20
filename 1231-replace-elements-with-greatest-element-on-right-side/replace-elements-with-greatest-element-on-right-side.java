class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums=new int[arr.length];
        int max=-1;
        nums[arr.length-1]=max;
        for(int i=arr.length-1;i>0;i--){
            
              if(arr[i]>max){
                max=arr[i];
                nums[i-1]=max;
            }else{
                nums[i-1]=max;
            }
        }
        return nums;
    }
}