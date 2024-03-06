class Solution {
     
    public void setZeroes(int[][] matrix) {
       int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-99998){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void markRow(int[][] matrix,int i){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=0)
            matrix[i][j]=-99998;
        }
    }
    public void markCol(int[][] matrix,int j){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0)
            matrix[i][j]=-99998;
        }
    }
}