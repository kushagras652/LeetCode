class Solution {
    public int sumBase(int n, int k) {
        String str="";
        while(n>0){
            str+=n%k;
            n=n/k;
        }
        int z=Integer.parseInt(str);
        int sum=0;
        while(z>0){
            sum+=z%10;
            z=z/10;
        }
        return sum;
    }
}