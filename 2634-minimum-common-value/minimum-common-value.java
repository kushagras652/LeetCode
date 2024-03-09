class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       for(int elem:nums1){
           set.add(elem);
       }
       for(int elem:nums2){
           if(set.contains(elem))
           return elem;
       }
       return -1;
    }
}