public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String st=Integer.toBinaryString(n);
        int count=0;
        for(char ch:st.toCharArray()){
            if(ch=='1')
            count++;
        }
        return count;
    }
}