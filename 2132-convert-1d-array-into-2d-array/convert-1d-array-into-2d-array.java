class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] a=new int[m][n];
        if(original.length!=m*n)
        return new int[0][0];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(index<original.length){
                    a[i][j]=original[index];
                    index++;
                }
            }
        }
        return a;
    }
}