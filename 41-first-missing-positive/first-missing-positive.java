class Solution {
    public int firstMissingPositive(int[] nums) {
        // PriorityQueue<Integer> p=new PriorityQueue<>();
        // for(Integer a:nums){
        //     if(a>0)
        //     p.add(a);
        // }
        //  int a=1;
        // while(!p.isEmpty()){
        //     int b=p.poll();
        //     if(b==a){
        //         a++;
        //     }
        //     else if(b>a){
        //         return a;
        //     }
        // }
        // return a;
        HashMap<Integer,Boolean> hp=new HashMap<>();
        for(Integer a:nums){
            if(a>0)
            hp.put(a,true);
        }
        int a=1;
        while(hp.containsKey(a)){
            a++;
        }
        return a;
    }
}