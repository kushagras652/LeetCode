class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        double pro=1.0;
         long power = Math.abs((long) n); 
        while (power > 0) {
            if (power % 2 == 1) {
                pro *= x;
            }
            
            x *= x;
            power /= 2;
        }
        
        if (n < 0) {
            pro = 1.0 / pro;
        }
        return pro;
    }
}