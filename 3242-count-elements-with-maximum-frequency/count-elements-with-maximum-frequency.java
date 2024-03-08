class Solution {
    public int maxFrequencyElements(int[] nums) {
       int count=0;
       int max=0;
       int[] freq=new int[101];
       for(int num:nums){
           freq[num]++;
       }
       for(int num:freq){
           max=Math.max(max,num);
       }
       for(int num:nums){
           if(max==freq[num])
           count++;
       }
       return count;
    }
    }
