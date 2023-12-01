class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1="";
        String st2="";
        for(int i=0;i<word1.length;i++){
            st1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            st2+=word2[i];
        }
        // if(st1.length()==st2.length()){
        //     for(int i=0;i<st1.length();i++){
        //         if(st1.charAt(i)!=st2.charAt(i))
        //         return false;
        //     }
        //     return true;
        // }
        if(st1.equals(st2))
        return true;
        return false;
    }
}