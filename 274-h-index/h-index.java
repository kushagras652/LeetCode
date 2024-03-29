class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
         int n=citations.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(citations[mid]==n-mid){
                return n-mid;
            }
            else if(citations[mid]<n-mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return n-start;
    }
}