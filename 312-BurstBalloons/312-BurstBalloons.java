// Last updated: 6/4/2026, 10:32:58 AM
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = arr[n + 1] = 1;
        System.arraycopy(nums, 0, arr, 1, n);
        int dp[][] = new int[n+2][n+2];

        for (int len = 2; len < n + 2; len++) {
            int end = n + 2 - len;
            for (int left = 0; left < end; left++) {
                int right = left + len;

                int l = arr[left];
                int r = arr[right];
                  int max = 0;

                for (int k = left+1; k < right; k++) {
                    int temp = l * arr[k] * r + dp[left][k] + dp[k][right];
                    max = max < temp ? temp : max;
                }

                dp[left][right] = max;
            }
        }
        return dp[0][n + 1];
    }
}