class Solution {
    public String thousandSeparator(int n) {
        if(n>=1000){
            String str=Integer.toString(n);
            int len=str.length();
            int pos=len-3;
            while(pos>=1){
                str=str.substring(0,pos)+'.'+str.substring(pos);
                pos=pos-3;
            }
            return str;
        }
        else
            return Integer.toString(n);
    }
}