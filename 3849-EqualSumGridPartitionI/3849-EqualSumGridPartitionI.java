// Last updated: 6/4/2026, 10:25:23 AM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long[] rowSum = new long[m];
        long[] colSum = new long[n];
        long total = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
                total += grid[i][j];
            }
        }

        if (total % 2 != 0) return false;

        long half = total / 2;

        long sum = 0;
        for (int i = 0; i < m; i++) {
            sum += rowSum[i];
            if (sum == half) return true;
        }

        sum = 0;
        for (int j = 0; j < n; j++) {
            sum += colSum[j];
            if (sum == half) return true;
        }

        return false;
    }
}