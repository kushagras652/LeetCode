class Solution {
    public int numPairsDivisibleBy60(int[] time) {
         int[] remainderCounts = new int[60];
        int count = 0;

        for (int duration : time) {
            int remainder = duration % 60;
            int complement = (60 - remainder) % 60;

            count += remainderCounts[complement];
            remainderCounts[remainder]++;
        }

        return count;
    }
}