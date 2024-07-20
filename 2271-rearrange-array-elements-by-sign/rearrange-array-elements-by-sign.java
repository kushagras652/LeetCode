class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        for(int elem:nums){
            if(elem>0)
            list1.add(elem);
            else
            list2.add(elem);
        }

          int posIndex = 0, negIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=list1.get(posIndex++);
            }
            else
            nums[i]=list2.get(negIndex++);
        }
        return nums;
    }
}