class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }
     int min=prices[0];
     int maxprofit=0;
     for(int i=1;i<prices.length;i++){
         if(prices[i]<min){
             min=prices[i];
         }
         int profit=prices[i]-min;
         if(profit>maxprofit){
             maxprofit=profit;
         }
     }
     return maxprofit;
    }
}