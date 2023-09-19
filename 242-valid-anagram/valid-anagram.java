class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first=s.toCharArray();
        char[] second=t.toCharArray();
        if(first.length!=second.length)
        return false;
        Arrays.sort(first);
        Arrays.sort(second);
        for(int i=0;i<first.length;i++){
            if(first[i]!=second[i])
            return false;
        }
        return true;
    }
}