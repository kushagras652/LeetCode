class Solution {
    public long minimumSteps(String s) {
        // int i=1;
        // long count=0;
        // char[] arr=s.toCharArray();
        // while(i<arr.length){
        //     if(arr[i-1]=='1' && arr[i]=='0'){
        //         char temp=arr[i-1];
        //         arr[i-1]=arr[i];
        //         arr[i]=temp;
        //         i++;
        //         count++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return count;
        long countOnes = 0;
        long minSteps = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                minSteps += countOnes;
            } else {
                countOnes += 1;
            }
        }

        return minSteps;
    }
}