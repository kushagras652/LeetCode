class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[j]+people[i]<=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}