class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minimumTime = 0;
        int l = 0;
        int r = 1;

        while (r < colors.length()) {
            if (colors.charAt(l) == colors.charAt(r)) {
                if (neededTime[l] < neededTime[r]) {
                    minimumTime += neededTime[l];
                    l = r;
                } else {
                    minimumTime += neededTime[r];
                }
            } else {
                l = r;
            }
            r++;
        }

        return minimumTime;
    }
}