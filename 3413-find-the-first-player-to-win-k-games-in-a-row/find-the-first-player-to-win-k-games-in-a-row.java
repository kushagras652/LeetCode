class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int b=skills[0],n=skills.length,res=0,curr=0;

        for(int i=1;i<n;i++){
            if(skills[i]>b){
                b=skills[i];
                curr=0;
                res=i;
            }
            if(++curr>=k)
            break;
        }
        return res;
    }
}