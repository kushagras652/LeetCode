class Solution {
    public int numTrees(int n) {
        // int a=2*cat(n)/(cat(n+1)*cat(n));
        return cat(n);
    }
    private int cat(int n){
        if(n<=1)
        return 1;
           int result = 0;
        for (int i = 0; i < n; i++) {
            result += cat(i) * cat(n - i - 1);
        }
        return result;
    }
}