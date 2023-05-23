class Solution {
    public int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int currentIndex=0;
       // if(start<end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
       // }
    //    else{
    //       // int currentIndex=0;
    //         while(arr[currentIndex]<target){
    //             currentIndex++;
    //         }
    //    }
        return start;
    }
}