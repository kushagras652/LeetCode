class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            sb.append((char)(rem+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return sb.reverse().toString();
    }
}