class Solution {
    public int maxWidthRamp(int[] nums) {
        //IT SHOWS TLE
        // int width=0;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]<=nums[j] && i<j){
        //             width=j-i;
        //             max=Math.max(max,width);
        //         }
        //     }
        // }
        // return max;

         int ans = 0;
        int n = nums.length;

        // Stack to store the pairs of (value, index) in decreasing order
        Stack<int[]> st = new Stack<>();
        
        // First pass: store elements in decreasing order
        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek()[0] > nums[i]) {
                st.push(new int[]{nums[i], i});
            }
        }

        // Second pass: start from the last index to find the largest ramp
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek()[0]) {
                int index = st.peek()[1];
                ans = Math.max(ans, i - index);
                st.pop();
            }
        }

        return ans;
    }
}