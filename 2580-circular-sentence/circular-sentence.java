class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] arr=sentence.toCharArray();
        for(int i=0;i<sentence.length()-2;i++){
            if(sentence.charAt(i+1)==' ' && sentence.charAt(i)!=sentence.charAt(i+2))
            return false;
        }
        if(arr[0]==arr[sentence.length()-1])
        return true;
        return false;
    }
}