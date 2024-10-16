class Solution {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1')
            ch[i]='0';
            else
            ch[i]='1';
        }
        String str2=new String(ch);
        int num2=Integer.parseInt(str2,2);
        return num2;
    }
}