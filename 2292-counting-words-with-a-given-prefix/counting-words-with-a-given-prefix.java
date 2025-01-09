class Solution {
    public int prefixCount(String[] words, String pref) {
        // int count=0;
        // int length=pref.length();
        // for(int i=0;i<words.length;i++){
        //     if(words[i].length()>length){
        //          String res=words[i].substring(0,length);
        //     if(res.equals(pref))
        //     count++;
        //     }
        //     else{
        //         continue;
        //     }
           
        // }
        // return count;

        int count=0;
        for(String word:words){
            if(word.startsWith(pref))
            count++;
        }
        return count;
    }
}