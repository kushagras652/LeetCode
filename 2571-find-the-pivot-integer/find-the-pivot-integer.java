class Solution {
    public int pivotInteger(int n) {
             if (n == 1) {
            return 1;
        }

        long totalSum = (long) (n * (n + 1)) / 2;
        long sum = 0; 

        for (int i = 1; i < n; i++) {
            
            sum += i;
            long sum2 = totalSum-sum+i;

            if (sum == sum2) {
                return i;
            }
        }
        return -1; 
    }
}