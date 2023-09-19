class Solution {
    public int repeatedStringMatch(String a, String b) {
        int first=a.length();
        int second=b.length();
        String c="";
        int count=0;
        while(c.length()<second+2*first){
            c=c.concat(a);
            count++;
             int index=c.indexOf(b);
        if(index!=-1)
        return count;
        }
       
        return -1;
    }
}