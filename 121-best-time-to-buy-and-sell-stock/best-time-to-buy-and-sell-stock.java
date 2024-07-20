class Solution {
    public int maxProfit(int[] prices) {



        //IT SHOWS TLE  
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<prices.length;i++){
        //     int sum=prices[i];
        //     for(int j=i+1;j<prices.length;j++){
        //         int diff=prices[j]-sum;
        //         max=Math.max(max,diff);
        //     }
        // }
        // if(max<0)
        // return 0;
        // return max;

        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}