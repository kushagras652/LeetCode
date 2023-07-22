class Solution {
    public int lastRemaining(int n) {
        if(n==1)
        return 1;
        int head=1;
        int remain=n;
        boolean left=true;
        int step=1;
        while(remain>1){
            if(left || remain%2==1){
                head+=step;
            }
            remain=remain/2;
            step*=2;
            left=!left;
        }
        return head;
    }
}