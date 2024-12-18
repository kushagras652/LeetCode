class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr=new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    break;
                }
                if(j==prices.length-1)
                arr[i]=prices[i];
            }
        }
        arr[prices.length-1]=prices[prices.length-1];
        return arr;
    }
}