class Solution {
    public int jump(int[] nums) {
        int jump=0,l=0,r=0;
        while(r<nums.length-1){
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(i+nums[i],farthest);
            }
            jump++;
            l=r+1;
            r=farthest;
        }
        return jump;
    }
}