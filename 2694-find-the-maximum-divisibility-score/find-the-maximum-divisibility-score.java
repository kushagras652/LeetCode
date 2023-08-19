class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=0;
        int maxDivisor=Integer.MAX_VALUE;
        for(int divisor:divisors){
             int count=0;
            for(int num:nums){
                if(num%divisor==0){
                    count++;
                }
            }
           if (count > max || (count == max && divisor < maxDivisor)) {
                max = count;
                maxDivisor = divisor;
        }
        
        }
        return maxDivisor;
    }
}