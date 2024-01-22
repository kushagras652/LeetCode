class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat = -1, missing = -1;
        int[] storage = new int[nums.length+1];

        for(int num : nums)
            storage[num]++; 

        for(int index=1; index<storage.length; index++)
            if(storage[index] == 0) missing = index;
            else if(storage[index]>1) repeat = index; 

        return new int[] {repeat,missing};
    }
}