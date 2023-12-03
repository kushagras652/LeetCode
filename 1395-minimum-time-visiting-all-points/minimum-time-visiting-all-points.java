class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=1;i<points.length;i++){
            time+=totime(points[i-1],points[i]);
        }
        return  time;
    }
    private int totime(int[] from,int[] to){
        int x=Math.abs(from[0]-to[0]);
        int y=Math.abs(from[1]-to[1]);
        return Math.max(x,y);
    }
}