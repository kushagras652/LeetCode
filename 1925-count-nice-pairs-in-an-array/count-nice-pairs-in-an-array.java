class Solution {
    int mod=1000000007;
    public int countNicePairs(int[] nums) {

    //Brute Force|Shows TLE
    //     int count=0;
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if((nums[i]-rev(nums[i]))==(nums[j]-rev(nums[j])))
    //             count++;
    //         }
    //     }
    //     return count;

  int n= nums.length;
        long bad=0;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0; i<n; i++){
            int r= rev(nums[i]);
            if(!mp.containsKey(nums[i]-r)){
                mp.put(nums[i]-r,1);
            } else {
                mp.put(nums[i]-r, mp.get(nums[i]-r)+1);
                bad= (bad+ mp.get(nums[i]-r)-1)%mod;
            }
        }
        
        return (int)(bad%mod);

    }
    private int rev(int n){
         int reversed = 0;
        
        while (n!= 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        return reversed;

    }

}