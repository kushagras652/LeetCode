class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int max=arr[0];
        if(k==1)
        return Math.max(arr[0],arr[1]);
        if(k>n){
            for(int i=1;i<n;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            return max;
        }
      int winner=arr[0];
      int count=0;
      for(int i=1;i<n;i++){
          if(winner>arr[i]){
              count++;
          }
          else{
              winner=arr[i];
              count=1;
          }
          if(count==k)
          return winner;
      }
      return winner;
    }
}