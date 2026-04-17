class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        backtrack(list,list2,candidates,target,0,0);
        return list;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> list2,int[] nums,int target,int sum,int index){
        if(sum==target){
            list.add(new ArrayList<>(list2));
            return ;
        }
        // if(index>=nums.length){
        //     return ;
        // }

        if(sum>target || index>=nums.length)
        return ;

        list2.add(nums[index]);
        backtrack(list,list2,nums,target,sum+nums[index],index);
        list2.remove(list2.size()-1);
        backtrack(list,list2,nums,target,sum,index+1);

    }
}