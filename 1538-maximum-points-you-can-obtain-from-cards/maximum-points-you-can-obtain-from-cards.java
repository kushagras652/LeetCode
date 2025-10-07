class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<=k-1;i++){
            leftsum+=cardPoints[i];
        }
        max=leftsum;
        int rightIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[rightIndex];
            rightIndex--;
            max=Math.max(max,leftsum+rightsum);
        }
        return max;
    }
}