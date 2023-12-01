class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // Copy the input array into an ArrayList
        for(int num: nums) arr.add(num);
        
        // Sort the ArrayList in ascending order
        Collections.sort(arr);

        // Iterate through the input array
        for (int i = 0; i < nums.length; i++) {
            // Find the index of the current element in the sorted ArrayList using binary search
            int index = bs(arr, nums[i]);
            
            // Add the index to the answer ArrayList
            ans.add(index);
            
            // Remove the element at the index from the sorted ArrayList
            arr.remove(index);
        }
        
        // Return the answer ArrayList
        return ans;
    }

    // Binary search method to find the index of an element in a sorted ArrayList
    static int bs (ArrayList<Integer> arr, int num) {
        int l = 0;
        int h = arr.size()-1;

        while (h >= l) {
            int m = l + (h-l)/2;
            int x = arr.get(m);
            if (x < num) {
                l = m + 1;
            } else if (x > num) {
                h = m -1;
            } else {
                if (m == 0) {
                    return m;
                } else if (x == arr.get(m-1)) {
                    h = m-1;
                } else {
                    return m;
                }
            }
        }
        // Return -1 if the element is not found
        return -1;
    }
}