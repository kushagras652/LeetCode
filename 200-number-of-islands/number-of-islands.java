class Solution {
    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0) {
            return 0;
        }
        // 0 is water,1 is piece of land,island is group of connected 1 where connections are only in 4 cardinal directions(up,down,left,right
        // When 1 is found,start dfs from cell to all connected land cells,mark all visited cells as 0 and increment the island count
           int rows = grid.length;
        int cols = grid[0].length;
        int numIslands = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                // it shud be unvisited,it means new dfs call,means a new island we have
                if(grid[i][j] == '1'){
                    numIslands++;
                    dfs(grid,i,j);
                } 
            }
        }
        return numIslands;
    }
    private void dfs(char[][] grid,int row,int col){
        int rows = grid.length;
        int cols = grid[0].length;

        // base condition,out of bound or already visited
        if(row < 0 || col < 0 || row>=rows || col >= cols || grid[row][col] == '0') return;

        // mark as visited
        grid[row][col] = '0';

// for iterating inside the island which means going thorugh cells which are in the 4 directions
        dfs(grid, row + 1, col); // down
        dfs(grid, row - 1, col); // up
        dfs(grid, row, col + 1); // right
        dfs(grid, row, col - 1); // left
    }
}