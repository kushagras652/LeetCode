class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long sum = sum(n);
        long k = 0;
        long a=1;
        
        if (sum <= target) {
            return 0;
        } else {
            while (sum > target) {
             k+=(10-(n%10))*a;
             a*=10;
             n/=10;
             n++;
             sum=sum(n);
            }
       }
        return k;
    }
    
    private long sum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
