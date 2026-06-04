// Last updated: 6/4/2026, 10:33:37 AM
class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1') {
                    ans++;
                    burn(grid,i,j);
                }
            }
        }
        return ans;
    }
     static void burn(char[][] grid,int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        burn(grid,i + 1, j);
        burn(grid,i - 1, j);
        burn(grid,i, j + 1);
        burn(grid,i, j - 1);
    }
}