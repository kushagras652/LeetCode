class Solution {
    
    public int maxProfit(int[] prices) {
        //T.C.: O(N) S.C.: O(1)

        if(prices.length == 0)
            return 0;

        int buyPrice1 = Integer.MAX_VALUE;
        int profit1 = Integer.MIN_VALUE;
        int buyPrice2 = Integer.MAX_VALUE;
        int profit2 = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            //first Transaction
            buyPrice1   = Math.min(buyPrice1, prices[i]);
            profit1     = Math.max(profit1, prices[i] - buyPrice1);

            //Second Transaction
            buyPrice2   = Math.min(buyPrice2, prices[i] - profit1); 
            profit2     = Math.max(profit2, prices[i] - buyPrice2);
        }

        return profit2;
    }
}