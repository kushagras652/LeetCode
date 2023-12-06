class Solution {
    public int totalMoney(int n) {
       int count=0;
       int a=1;
       for(int i=1;i<=n;i++){
           count+=a+(i-1)%7;
           if(i%7==0){
               a++;
           }
       }
       return count;
    }
}