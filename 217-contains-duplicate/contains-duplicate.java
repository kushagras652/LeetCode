class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int elem:nums){
            if(set.contains(elem)){
                return true;
            }
            set.add(elem);
        }
        return false;
    }
}