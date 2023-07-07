class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int count = 0;
        int maxCount = 0;
        int trueCount = 0;
        int falseCount = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (answerKey.charAt(right) == 'T')
                trueCount++;
            else
                falseCount++;
            
            while (Math.min(trueCount, falseCount) > k) {
                if (answerKey.charAt(left) == 'T')
                    trueCount--;
                else
                    falseCount--;
                left++;
            }
            
            count = right - left + 1;
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;

    }
}