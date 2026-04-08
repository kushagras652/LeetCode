class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxcount=0;
        // int i=0,j=0;
        // int count=0;
        // String st="";
        // while(j<s.length()){
            
        //     if(st.contains(s.charAt(j)+"")){
        //         i=j;
        //         // j++;
        //         count=0;
        //         st="";
        //     }else{
        //         count++;
        //         j++;
        //         if(maxcount<count){
        //             maxcount=count;
        //         }
        //     }
        // }
        // return maxcount;

        // if(s==" ")
        // return 1;

        int max=0;
        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;
        while(j<s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));

            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}