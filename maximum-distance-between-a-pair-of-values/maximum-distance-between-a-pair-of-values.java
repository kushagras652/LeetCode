class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int diff=0;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                diff=Math.max(diff,j-i);
                j++;
            }
            else
            i++;
        }
        return diff;
    }
}