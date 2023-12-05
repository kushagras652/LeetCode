class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int a=0;
        while(n!=1){
            if(n%2==0){
                 a=n/2;
                 matches+=a;
                n=n/2;
                a=0;
            }
            else{
                a=n/2;
                matches+=a;
                n=(n/2)+1;
                a=0;
            }
        }
        return matches;
    }
}