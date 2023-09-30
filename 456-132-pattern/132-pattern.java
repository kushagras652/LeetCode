class Solution {
    public boolean find132pattern(int[] nums) {

        int n = nums.length;

        if(n<3) return false;

        Stack<Integer> s = new Stack<>();

        int small = Integer.MIN_VALUE;

        for(int i=n-1; i>= 0 ; i--){

            if(nums[i] < small){
                return true;
            }
            
            while(!s.isEmpty() && nums[i] > s.peek()){
                small = s.pop();
            }

            s.push(nums[i]);

        }

        return false;


    }
}