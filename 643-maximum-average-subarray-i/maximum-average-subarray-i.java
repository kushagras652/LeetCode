class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0, ans = Integer.MIN_VALUE;
        int i = 0, j = 0, n = nums.length;
        while (j < n) {
            sum += nums[j];
            if (j - i + 1 == k) {
                ans = Math.max(ans, sum / k);
                sum -= nums[i++];
            }
            j++;
        }
        return ans;
    }
}
