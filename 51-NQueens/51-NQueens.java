// Last updated: 6/4/2026, 10:35:15 AM
class Solution {
    List<List<String>> ans = new ArrayList<>();
    char[][] grid;
    Set<Integer> cols = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();
    Set<Integer> diag2 = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        solve(0, n);
        return ans;
    }

    void solve(int row, int n) {
        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(grid[i]));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (!(cols.contains(col) || diag1.contains(row + col) || diag2.contains(row - col))) {

                grid[row][col] = 'Q';

                cols.add(col);
                diag1.add(row + col);
                diag2.add(row - col);

                solve(row + 1, n);

                grid[row][col] = '.';

                cols.remove(col);
                diag1.remove(row + col);
                diag2.remove(row - col);
            }
        }
    }
}