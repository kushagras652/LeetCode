class Solution {
    public int bestClosingTime(String customers) {
        int max=0,score=0,righttime=-1;
        for(int i=0;i<customers.length();++i){
            score+=(customers.charAt(i)=='Y')?1:-1;
            if(score>max){
                max=score;
                righttime=i;
            }
        }
        return righttime+1;
    }
}