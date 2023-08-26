class Solution {
    public String baseNeg2(int n) {
        if(n==0)
            return "0";
        String ans = "";
        while(n!=0){
            int rem = n%-2;
            n = n/-2;
            if(rem==-1){ 
                n++;
                rem = 1; 
            }
            ans = String.valueOf(rem).concat(ans); 
        }
        return ans;
    }
}