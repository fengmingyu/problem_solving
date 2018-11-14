class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int x=1; x<m; x++){
            grid[x][0] += grid[x-1][0];
        }
        for (int y=1; y<n; y++){
            grid[0][y] += grid[0][y-1];
        }
        for (int x=1; x<m; x++){
            for (int y=1; y<n; y++){
                grid[x][y] += Math.min(grid[x-1][y], grid[x][y-1]);
            }
        }
        return grid[m-1][n-1];
    }
}