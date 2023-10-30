class Solution {
    public int numberOfSteps(int num) {
       return rec(num,0);
    }
    private int rec(int n,int count){
        if(n==0){
             return count;
        }
       
        if(n%2==0){
            return rec(n/2,count+1);
        }
        
        return rec(n-1,count+1);
    }
}