class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (valid(nums, p, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
   
    private boolean valid(int[] nums, int p, int maxDiff) {
        int count = 0;
        for (int i = 0; i < nums.length - 1 && count < p;) {
            if (nums[i+1] - nums[i] <= maxDiff) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        
        return count >= p;
    }
}