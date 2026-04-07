class Solution {
    public int maxProfit(int[] prices) {
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int newMax=prices[j]-prices[i];
        //         if(max<newMax){
        //             max=newMax;
        //         }
        //     }
        // }
        // return max;

        int min=prices[0];
        int max=0;

        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            if(max<profit){
                max=profit;
            }
            if(min>prices[i])
            min=prices[i];
        }
        return max;
    }
}