class Solution {
    public int maximumPrimeDifference(int[] nums) {
       int i=0, j=nums.length - 1;

        while(i < j) {
            if(isPrime(nums[i]) && isPrime(nums[j])) {
                return j-i;
            } 
            else if(isPrime(nums[i]) && !isPrime(nums[j])) {
                j--;
            } else if(!isPrime(nums[i]) && isPrime(nums[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return 0;
    }
    public boolean isPrime(int x){
        if(x<=1)
            return false;
        
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}