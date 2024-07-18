class Solution {
    public int[] twoSum(int[] nums, int target) {

        //BRUTE FORCE
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        // OPTIMIZE APPROACH
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(map.containsKey(b) && map.get(b)!=i){
               return  new int[]{i,map.get(b)};
            }
        }
        return new int[]{-1,-1};
    }
}