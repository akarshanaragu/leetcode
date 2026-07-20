// Last updated: 20/7/2026, 10:39:19 pm
1class Solution {
2
3    int[] dp = new int[38];
4
5    public int tribonacci(int n) {
6
7        if (n == 0)
8            return 0;
9            
10        if (n == 1 || n == 2)
11            return 1;
12
13        if (dp[n] != 0)
14            return dp[n];
15
16        dp[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
17        return dp[n];
18    }
19}