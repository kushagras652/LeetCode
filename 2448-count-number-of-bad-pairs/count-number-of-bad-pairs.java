class Solution {
    public long countBadPairs(int[] a) {

        //SHOWING TLE

        // long count=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]-i)!=(nums[j]-j)){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        long cnt=0;
    HashMap<Integer,Integer> mp= new HashMap<>();
    for(int i=0;i<a.length;i++){
        int prev= mp.getOrDefault(i-a[i],0);
        cnt+= i- prev;
        mp.put(i-a[i],prev+1);
    }
    return cnt;

    }
}