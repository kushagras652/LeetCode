class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPlaindrome(s,i,j))
                ans++;
            }
        }
        return ans;
    }
    public boolean isPlaindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--))
            return false;
        }
        return true;
    }
}