class Solution {
    public int addDigits(int num) {
        int digit=repeat(num);
        if(digit/10>0){
             return addDigits(repeat(digit));
            
        }
        // if(digit%10==0){
        //     return digit;
        // }
        else{
          return digit;
        }
    }
    public int repeat(int nums){
         int sum=0;
        while(nums>0){
            int rem=nums%10;
            sum=sum+rem;
            nums=nums/10;
        }
        return sum;
    }
}