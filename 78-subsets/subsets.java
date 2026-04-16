class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        subs(0,nums,list,list2);
        return list;
    }

    public void subs(int index,int[] nums,List<List<Integer>> list,ArrayList<Integer> list2){
        if(index==nums.length){
            list.add(new ArrayList<>(list2));
            return ;
        }
        list2.add(nums[index]);
        subs(index+1,nums,list,list2);
        list2.remove(list2.size()-1);
        subs(index+1,nums,list,list2);

        return ;
    }
}