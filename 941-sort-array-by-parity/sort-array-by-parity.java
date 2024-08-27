class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int elem:nums){
            if(elem%2==0){
                list1.add(elem);
            }
            else{
                list2.add(elem);
            }
        }
            int i=0;
        while(!list1.isEmpty()){
            nums[i]=list1.remove(0);
            i++;
        }
          while(!list2.isEmpty()){
            nums[i]=list2.remove(0);
            i++;
        }
        return nums;
    }
}