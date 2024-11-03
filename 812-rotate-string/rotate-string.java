class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;

        while(i<s.length()){
            char delete=sb.charAt(0);

            sb.deleteCharAt(0);

            sb.append(delete);
            String str=sb.toString();

            if(str.equals(goal))
            return true;

            i++;
        }
        return false;
    }
}