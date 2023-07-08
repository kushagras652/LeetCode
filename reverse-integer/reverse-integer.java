class Solution {
    public int reverse(int x) {
        long sum=0;
       int sign=x<0 ?-1:1;
        x=Math.abs(x);
      
        while(x>0){
            int rev=x%10;
            sum=sum*10+rev;
            x=x/10;
        }
         sum=sum*sign;
          if (sum > Math.pow(2,31) || sum < Math.pow(-2,31)) {
            return 0;
        }
        return (int)sum;
    }
}