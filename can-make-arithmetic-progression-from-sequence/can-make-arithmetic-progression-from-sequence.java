class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
       int i=1;
      int d=arr[i]-arr[i-1];
       
       for(int j=2;j<arr.length;j++){
           if(arr[j]-arr[j-1]!=d){
            return false;
           }
       }
        return true;
    }
}