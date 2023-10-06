class Solution {
    public int integerBreak(int n) {
         if (n == 2) {
            return 1; // Special case for n = 2, as it's an edge case.
        }
        
        if (n == 3) {
            return 2; // Special case for n = 3, as it's an edge case.
        }

        int product = 1;

        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        return product * n;
    }
}