class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> elem=new ArrayList<>();
        int size=nums.length/3;
        int count=1;

         if (nums.length == 0) {
            return elem;
        }
        Arrays.sort(nums);
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>size && !elem.contains(nums[i-1])){
                elem.add(nums[i-1]);
            }
            i++;
        }
         if (count > size && !elem.contains(nums[nums.length - 1])) {
            elem.add(nums[nums.length - 1]);
        }
        return elem;
    }
}