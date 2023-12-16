class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        sub(nums,0,ds,ans);
        return ans;
    }
    private void sub(int[] nums,int index,List<Integer> ds,List<List<Integer>> ans){
        int n=nums.length;
        if(index==n){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);
        sub(nums,index+1,ds,ans);
        ds.remove(ds.size()-1);
        sub(nums,index+1,ds,ans);
    }
}