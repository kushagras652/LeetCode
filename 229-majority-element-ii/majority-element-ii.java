class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
            count++;

            if(nums[i]!=nums[i+1])
            count=1;

            if(count>n/3){
                if(!list.contains(nums[i]))
                list.add(nums[i]);
            }
        }
         if (count > n/3 && !list.contains(nums[nums.length - 1])) {
            list.add(nums[nums.length - 1]);
        }
        return list;
    }
}