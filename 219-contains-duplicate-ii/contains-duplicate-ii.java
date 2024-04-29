class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int i=0,j=1;
        // while(j!=nums.length){
        //     if(nums[j]==nums[i])
        //     return true;
        //     if(j-i+1<k){
        //         j++;
        //     }
        //     else if(j-i+1==k){
        //         i++;
        //         j++;
        //     }
        // }
        // return false;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (i >= k) {
                set.remove(nums[i - k]);
        }
     
    }
       return false;
}
}