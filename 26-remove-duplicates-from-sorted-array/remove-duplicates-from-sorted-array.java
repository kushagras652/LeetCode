class Solution {
    public int removeDuplicates(int[] nums) {


        //BRUTE FORCE
        // Set<Integer> set=new HashSet<>();
        // for(int elem:nums){
        //     set.add(elem);
        // }
        // int j=0;
        // for(int x:set){
        //     nums[j++]=x;
        // }
        // return set.size();

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
    }
}