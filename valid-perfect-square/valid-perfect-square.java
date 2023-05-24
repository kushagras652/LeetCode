class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
       int start=2;
       int end=num/2;
       while(start<=end){
           long mid=start+(end-start)/2;
           long sq=mid*mid;
          
           if(sq>num){
               end=(int)mid-1;
           }
           else if(sq<num){
               start=(int)mid+1;
           }
           else{
               return true;
           }
       }
       return false;
    }
}