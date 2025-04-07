class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //this shows error if there are negetive integrs in array 
        //bcoz array canot store  for negative values 
        // List<Integer> list=new ArrayList<>();
        // int n=nums.length;
        // int a=n/3;
        // Arrays.sort(nums);
        // int[] freq=new int[nums[n-1]+1];
        // for(int i=0;i<n;i++){
        //     freq[nums[i]]++;
        // }
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>a)
        //     list.add(i);
        // }
        // return list;

         List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int a=n/3;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int elem:nums){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>a){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}