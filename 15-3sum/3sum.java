class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
       Set<List<Integer>> ds=new HashSet<>();
       Arrays.sort(nums);
       int target=0;
       for(int i=0;i<nums.length;i++){
          int j=i+1;
          int k=nums.length-1;
          while(j<k){
              int sum=nums[i]+nums[j]+nums[k];
              if(sum==target){
                  ds.add(Arrays.asList(nums[i],nums[j],nums[k]));
                  j++;
                  k--;
              }
              else if(sum<target){
                  j++;
              }
              else{
                  k--;
              }
          }
       }
       result.addAll(ds);
       return result;
    }
}