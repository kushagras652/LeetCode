class Solution {
    public boolean buddyStrings(String s, String goal) {
       if(s.length()!=goal.length()){
           return false;
       }
       int[] counts = new int[26];
        int count = 0;
        int firstDiff = -1;
        int secDiff = -1;

        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i)-'a']++;
            if(s.charAt(i)==goal.charAt(i)){
                continue;
            }else{
                count++;
                if(count==1){
                    firstDiff = i;
                }else if(count==2){
                    secDiff = i;
                }else{
                    return false;
                }
            }
        }
        if(count==1){
            return false;
        }
        if(count==0){
            for(int c: counts){
                if(c>1){
                    return true;
                }
            }
            return false;
        }

        if(s.charAt(firstDiff)==goal.charAt(secDiff) && s.charAt(secDiff)==goal.charAt(firstDiff)){
            return true;
        }else{
            return false;
        }
    }
}