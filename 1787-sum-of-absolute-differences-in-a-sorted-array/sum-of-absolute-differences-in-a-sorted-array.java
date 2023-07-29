class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         int n = nums.length;
        int[] result = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            result[i] = (nums[i] * i) - leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += rightSum - (nums[i] * (n - 1 - i));
            rightSum += nums[i];
        }

        return result;
    }
}