class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;

        for (char ch: s.toCharArray()) {
            sum1 = sum1 + ch;
        }

        for (char ch: t.toCharArray()) {
            sum2 = sum2 + ch;
        }

        return (char)(sum2 - sum1);
        
    }
}