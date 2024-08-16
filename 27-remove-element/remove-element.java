class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int elem:nums){
            if(elem!=val){
                list.add(elem);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}