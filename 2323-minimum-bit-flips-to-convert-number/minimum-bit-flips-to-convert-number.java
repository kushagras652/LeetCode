class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int count=0;
        while(ans>1){
            count+=ans&1;
            ans=ans>>1;
        }
        if(ans==1)
        count++;
        return count;
    }
}