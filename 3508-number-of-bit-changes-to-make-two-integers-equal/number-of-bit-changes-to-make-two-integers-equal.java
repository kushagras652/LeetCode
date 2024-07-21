class Solution {
    public int minChanges(int n, int k) {
        int c=n^k;
        int count=0;
        while(c!=0){ 
            if((c&1)==1){
                if((n&1)!=1) return -1;
                count++;
            }
            n=n>>1;
            c=c>>1;
           
        }
        return count;

    }
}