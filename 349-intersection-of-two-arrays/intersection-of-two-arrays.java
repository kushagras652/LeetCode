class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();

        for(int elem:nums1){
            set.add(elem);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int elem:nums2){
            if(set.contains(elem)){
                list.add(elem);
                set.remove(elem);
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}