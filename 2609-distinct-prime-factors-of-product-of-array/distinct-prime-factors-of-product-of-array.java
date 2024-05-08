class Solution {
    public int distinctPrimeFactors(int[] nums) {

        //THIS APPROACH IS CORRECT BUT SOME OF THE TESTCASES ARE FAILING

        // int n=1;
        // for(int elem:nums){
        //     n=n*elem;
        // }
        // Set<Integer> set=new HashSet<>();
        // while(n%2==0){
        //         set.add(2);
        //     n=n/2;
        // }
        // for(int i=3;i*i<=n;i+=2){
        //     while(n%i==0){
        //         set.add(i);
        //     n=n/i;
        //     }
        // }

        //  if (n > 2) {
        //     set.add(n);
        // }
        // return set.size();

        Set<Integer> set=new HashSet<>();
        for(int elem:nums){
            int i=2;
            while(elem>1){
                if(elem%i==0){
                    set.add(i);
                    elem/=i;
                }
                else{
                    i++;
                }
            }
        }
        return set.size();
    }
}