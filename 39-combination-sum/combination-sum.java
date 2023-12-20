class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        sum(candidates,ds,result,0,target);
        return result;
    }
    private void sum(int[] arr,List<Integer> ds,List<List<Integer>> result,int index,int target){
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
       if(arr[index]<=target){
           ds.add(arr[index]);
           sum(arr,ds,result,index,target-arr[index]);
           ds.remove(ds.size()-1);
       }
       sum(arr,ds,result,index+1,target);
    }
}