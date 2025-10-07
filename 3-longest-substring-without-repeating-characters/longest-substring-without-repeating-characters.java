class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] freq=new int[256];
       Arrays.fill(freq,-1);
       int left=0,right=0;
       int max=0;
       int n=s.length();
       while(right<n){
        if(freq[s.charAt(right)]!=-1){
            if(freq[s.charAt(right)]>=left){
                left=freq[s.charAt(right)]+1;
            }
        }
        int length=right-left+1;
        max=Math.max(max,length);
        freq[s.charAt(right)]=right;
        right++;
       }
       return max;
    }
}