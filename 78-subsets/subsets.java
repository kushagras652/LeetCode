class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        set.add(new ArrayList<>());

        for(int num:nums){
            int size=set.size();
            for(int j=0;j<size;j++){
                List<Integer> subset=new ArrayList<>(set.get(j));
                subset.add(num);
                set.add(subset);
            }
        }
        return set;
    }
}