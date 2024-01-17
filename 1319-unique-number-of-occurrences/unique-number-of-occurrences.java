class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      int[] freq = new int[2000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+1000]++;
        }
        Arrays.sort(freq);
        for(int i=0;i<freq.length-1;i++){
            if(freq[i]!=0 && freq[i]==freq[i+1]) return false;
        }
        return true;
    }
}