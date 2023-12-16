class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        Arrays.sort(nums);
        recur(nums,ds,ans,freq);
        return ans;
    }
    private void recur(int[] nums,List<Integer> ds,List<List<Integer>> result,boolean[] freq){
        if(ds.size()==nums.length){
            result.add(new ArrayList(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if (freq[i] || (i > 0 && nums[i] == nums[i - 1] && !freq[i - 1])) {
                continue;
            }
                freq[i]=true;
                ds.add(nums[i]);
                recur(nums,ds,result,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
        }
    }
}