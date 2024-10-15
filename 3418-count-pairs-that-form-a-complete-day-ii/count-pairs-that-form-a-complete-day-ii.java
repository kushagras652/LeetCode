class Solution {
    public long countCompleteDayPairs(int[] hours) {
    //     int[] arr=new int[hours.length];
    //     int j=0;
    //     int count=0;
    //     for(int i=0;i<hours.length;i++){
    //         // for(int j=i+1;j<hours.length;j++){
    //         //     if((hours[i]+hours[j])%24==0){
    //         //         count++;
    //         //     }
    //         // }
    //         if(hours[i]%12==0){
    //             arr[j]=hours[i];
    //             j++;
    //         }
    //     }
    //    for(int i=0;i<arr.length;i++){
    //     for(int k=i+1;k<arr.length;k++){
    //         if((arr[i]+arr[k])%24==0)
    //         count++;
    //     }
    //    }
    //    return count/2;

    HashMap<Integer, Integer> seenMap = new HashMap<>();
        long count = 0;

        for (int hour : hours) {
            int rem = hour % 24;
            int complement = (24 - rem) % 24;
            if (seenMap.containsKey(complement)) {
                count += seenMap.get(complement);
            }
            seenMap.put(rem, seenMap.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}