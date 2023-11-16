class Solution {
    public String findDifferentBinaryString(String[] nums) {

          HashSet<String> set = new HashSet<>();

        // Add all binary strings from the array to the HashSet
        for (String num : nums) {
            set.add(num);
        }

        // Iterate through all possible binary strings of length n
        int n = nums.length;
        
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<nums.length;++i){
            char curr=nums[i].charAt(i);

            sb.append((curr=='0'?'1':'0'));
        }
        return sb.toString();

    }
}