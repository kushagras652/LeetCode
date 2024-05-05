class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        return false;

          int v=0;
        int c=0;
        int ch=0;
        for(int i=0;i<word.length();i++){
            char chh=word.charAt(i);
            if(word.charAt(i)>='a' && word.charAt(i)<='z' || word.charAt(i)>='A' && word.charAt(i)<='Z' || word.charAt(i)>='0' && word.charAt(i)<='9'){
                ch++;
                if(chh=='a' || chh=='e' || chh=='i' || chh=='o' || chh=='u'|| chh=='A' || chh=='E' || chh=='I' || chh=='O' || chh=='U' )
                    v++;
                else
                    if(word.charAt(i)>='a' && word.charAt(i)<='z'|| word.charAt(i)>='A' && word.charAt(i)<='Z')
                    c++;
            }
            else
                return false;
        }
        if(v>=1 && c>=1 && ch>=3)
            return true;
        return false;
    }
}