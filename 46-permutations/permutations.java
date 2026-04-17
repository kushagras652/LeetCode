class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        backtrack(list,list2,nums);
        return list;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> list2,int[] nums){
        if(list2.size()==nums.length){
            list.add(new ArrayList<>(list2));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list2.contains(nums[i]))
            continue;
            list2.add(nums[i]);
            backtrack(list,list2,nums);
            list2.remove(list2.size()-1);
        }
    }
}