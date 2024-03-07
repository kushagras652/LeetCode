class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            int divisorCount = 0;
            int divisorSum = 0;

            for (int i = 1; i * i <= num && divisorCount <= 4; i++) {
                if (num % i == 0) {
                    divisorCount++;
                    divisorSum += i;
                    if (i * i != num) { // Avoid counting square root twice
                        divisorCount++;
                        divisorSum += num / i;
                    }
                }
            }

            if (divisorCount == 4) {
                sum += divisorSum;
            }
        }

        return sum;
    }
}