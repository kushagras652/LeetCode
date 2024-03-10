class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       ArrayList<Integer> list=new ArrayList<>();
       for(int num:nums1){
           if(binarySearch(nums2,num)){
               list.add(num);
            //    if(list.contains(num)){
            //        list.remove(num);
            //    }
           }
       }
        HashSet<Integer> uniqueSet = new HashSet<>(list);
        ArrayList<Integer> list2=new ArrayList<>(uniqueSet);
       int[] intersectionArray=new int[list2.size()];
       for(int i=0;i<list2.size();i++){
           intersectionArray[i]=list2.get(i);
       }
       return intersectionArray;
    }
    public boolean binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target<arr[middle]){
                end=middle-1;
            }
            else if(target>arr[middle]){
                start=middle+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}