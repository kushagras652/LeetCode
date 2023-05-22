class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
        
        // Iterate through the digits in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i]++;
            
            // If the digit becomes 10, set it to 0 and carry over the 1 to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No carry over, so we can return the digits array
                return digits;
            }
        }
        
        // If we reach here, it means the leftmost digit was 9 and got incremented to 10
        // We need to add an additional digit in the array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
}