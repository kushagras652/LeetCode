class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int s=n/4;
      //  Arrays.sort(arr);
        int count=1;
        int a=arr[0];
        for(int i=1;i<n;i++){
            if(a==arr[i])
            count++;
            else
            count=1;
            if(count>s)
            return arr[i];

            a=arr[i];
        }
        return a;
    }
}