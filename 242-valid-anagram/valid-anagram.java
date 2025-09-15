class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    t=t.substring(0,j)+""+t.substring(j+1,t.length());
                    // System.out.println(t);
                    break;
                }
            }
        }
        if(t.equals("")){
            return true;
        }
        else{
            return false;
        }
        }else{
            return false;
        }
    }
}