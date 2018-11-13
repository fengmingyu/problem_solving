class Solution {
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        for(int y=0; y<n; y++){
            path[0][y] = 1;
        }
        for(int x=0; x<m; x++){
            path[x][0] = 1;
        }
        for(int x=1; x<m; x++){
            for(int y=1; y<n; y++){
                path[x][y] = path[x-1][y] + path[x][y-1];
            }
        }
        return path[m-1][n-1];
    }
}