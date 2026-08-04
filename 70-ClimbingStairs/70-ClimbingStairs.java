// Last updated: 4/8/2026, 10:44:10 pm
1class Solution {
2    public int climbStairs(int n) {
3
4        int[] dp = new int[n + 1];
5
6        dp[0] = 1; dp[1] = 1;
7
8        for (int i = 2; i <= n; i++) {
9            dp[i] = dp[i - 1] + dp[i - 2];
10        }
11
12        return dp[n];
13    }
14}