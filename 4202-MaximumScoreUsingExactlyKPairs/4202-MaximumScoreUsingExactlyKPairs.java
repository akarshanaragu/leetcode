// Last updated: 6/4/2026, 10:25:13 AM
import java.util.*;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] xaluremoni = new int[][]{nums1, nums2};

        int n = nums1.length;
        int m = nums2.length;

        long NEG = Long.MIN_VALUE / 4;
        long[][][] dp = new long[n + 1][m + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(dp[i][j], NEG);
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j][0] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int t = 1; t <= k; t++) {
                    dp[i][j][t] = Math.max(
                        Math.max(dp[i - 1][j][t], dp[i][j - 1][t]),
                        dp[i - 1][j - 1][t - 1] + (long) nums1[i - 1] * nums2[j - 1]
                    );
                }
            }
        }

        return dp[n][m][k];
    }
}
