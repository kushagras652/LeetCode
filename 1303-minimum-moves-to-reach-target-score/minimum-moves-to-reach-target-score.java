class Solution {
    public int minMoves(int target, int maxDoubles) {
        // int x=1;
        int count=0;
        while(target>1 && maxDoubles>0){
            if(target%2==0){
                maxDoubles--;
                target/=2;
                count++;
            }
            else{
                target-=1;
                count++;
            }
        }
        return count+(target-1);
    }
}