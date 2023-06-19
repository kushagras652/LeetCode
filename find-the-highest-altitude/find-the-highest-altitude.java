class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int num=0;

        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            num=Math.max(num,sum);
        }
      return num;
    }
}