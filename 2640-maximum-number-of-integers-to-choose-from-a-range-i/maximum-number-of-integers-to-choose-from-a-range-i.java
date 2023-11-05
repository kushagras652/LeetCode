class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            list.add(banned[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!list.contains(i) && sum+i<=maxSum) {
                sum += i;
                count++;
            }
        }
        return count;
    }
}