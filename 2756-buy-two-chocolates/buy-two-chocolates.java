class Solution {
    public int buyChoco(int[] prices, int money) {
        // int[] arr=new int[3*prices.length];
        // int sum=0;
        // int n=prices.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         sum=prices[i]+prices[j];
        //     arr[j]=sum;
        //         j++;
        //     }
        // }
        // int minimum=Arrays.stream(prices).min().getAsInt();
        // if(minimum<money){
        //     return  money-minimum;
        // }
        // else if(minimum>money){
        //     return money;
        // }
        // else{
        //     return 0;
        // }
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum>money){
            return money;
        }
        return money-sum;
    }
}