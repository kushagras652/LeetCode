class Solution {
    public long minimalKSum(int[] nums, int k) {


        //ITS SHOWING TLE

        // Set<Integer> set=new HashSet<>();
        // for(int elem:nums){
        //     set.add(elem);
        // }

        // long sum=0;
        // for(int i=1;i<Integer.MAX_VALUE;i++){
        //     if(!set.contains(i)){
        //         sum+=i;
        //         k--;
        //         if(k==0)
        //         break;
        //     }
        // }
        // return sum;

        Arrays.sort(nums);

        Set<Integer> set=new HashSet<>();
        long sum=0;

        for(int elem:nums){
            if(!set.contains(elem) && elem<=k){
                k++;
                sum+=elem;
            }
            set.add(elem);
        }
        long res=(long) (1+k)*k/2-sum;
        return res;
    }
}