class Solution {
   int i=0;
    public String reverseParentheses(String s) {
        char[] arr=s.toCharArray();
        return helper(arr);
    }
    public String helper(char[] arr){
        StringBuilder sb = new StringBuilder();
        // int i=0;
        while(i<arr.length){
            if(arr[i] == ')'){
                i++;
                return sb.reverse().toString();
            }
            else if(arr[i]=='('){
                i++;
                String st=helper(arr);
                sb.append(st);
            }
            else{
                sb.append(arr[i]);
                i++;
            }
        }
        return sb.toString();
    }
}