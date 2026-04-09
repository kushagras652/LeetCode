class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        // HashSet<Integer> set=new HashSet<>();
        List<List<Integer>> list2=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum=nums[i]+nums[j];
        //         if(set.contains(-sum)){
        //             ArrayList<Integer> list=new ArrayList<>();
        //             list.add(nums[i]);
        //             list.add(nums[j]);
        //             list.add(-sum);
        //             if(!list2.contains(list))
        //             list2.add(list);
        //         }
                
        //         set.add(nums[j]);
        //     }
        //     set.add(nums[i]);
        // }

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
            continue;
            int left=i+1,right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
            if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                list2.add(list);
                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // skip duplicate right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
            }
            }
            
        }
        
        return list2;
    }
}