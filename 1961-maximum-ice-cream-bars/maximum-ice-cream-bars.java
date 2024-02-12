class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
            count++;
            coins=coins-costs[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}