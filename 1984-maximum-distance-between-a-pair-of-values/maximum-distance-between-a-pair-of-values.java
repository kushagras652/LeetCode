// class Solution {
//     public int maxDistance(int[] nums1, int[] nums2) {
//         int max=0;
//         for(int i=nums2.length-1;i>=0;i--){
//             int index=search(nums1,nums2[i]);
//             if(index<0){
//                 continue;
//             }
//             if(max<(i-index)){
//                 max=i-index;
//             }
//         }
//         return max;
//     }
//     public int search(int [] nums1,int target){
//         int start=0;
//         int end=nums1.length-1;

//         if(target<nums1[end]){
//             return -1;
//         }

//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums1[mid]>target){
//                 start=mid+1;
//             }else if(nums1[mid]<target){
//                 end=mid-1;
//             }else if(nums1[mid]==target){
//                 return mid;
//             }
//         }
//         return start;
//     }
// }


class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist = 0;
        
        for (int j = 0; j < nums2.length; j++) {
            // We need to find the smallest i such that nums1[i] <= nums2[j]
            // AND i <= j. So we only search up to index j.
            int i = findSmallestIndex(nums1, nums2[j], Math.min(j, nums1.length - 1));
            
            if (i != -1 && i <= j) {
                maxDist = Math.max(maxDist, j - i);
            }
        }
        return maxDist;
    }

    private int findSmallestIndex(int[] nums1, int target, int endBound) {
        int start = 0;
        int end = endBound;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If nums1[mid] is less than or equal to target, 
            // it's a valid candidate. Try to find an even smaller index (to the left).
            if (nums1[mid] <= target) {
                ans = mid;
                end = mid - 1;
            } else {
                // nums1[mid] is too large, look to the right (since it's non-increasing)
                start = mid + 1;
            }
        }
        return ans;
    }
}