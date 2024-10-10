class Solution {
    public int minAddToMakeValid(String s) {
        // int a=0;
        // int b=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(')
        //     a++;
        //     if(s.charAt(i)==')')
        //     b++;
        // }
        // return Math.abs(a-b);
        Stack<Character> st=new Stack<>();
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    b++;
                }
            }
        }
        return st.size()+b;
    }
}