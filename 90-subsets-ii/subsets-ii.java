class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list2=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);

        subset(nums,list,list2,0);
        return list;
    }
    public void subset(int[] nums,List<List<Integer>> list,List<Integer> list2,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(list2));
            return ;
        }

        list2.add(nums[index]);
        subset(nums,list,list2,index+1);
        list2.remove(list2.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }

        subset(nums,list,list2,index+1);
    }
}