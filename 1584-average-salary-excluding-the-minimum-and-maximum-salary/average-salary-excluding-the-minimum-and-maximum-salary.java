class Solution {
    public double average(int[] salary) {
       int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        double sum = 0;
        
        for (int s : salary) {
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            sum += s;
        }
        
        return (sum - min - max) / (salary.length - 2.0);
    }
}