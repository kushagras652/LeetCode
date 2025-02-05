class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        return true;
        int count=0;
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                set1.add(s1.charAt(i));
                set2.add(s2.charAt(i));
                count++;
            }
        }
        if(count==2 && set1.equals(set2))
        return true;
        return false;

       
    }
}