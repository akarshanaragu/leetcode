// Last updated: 8/9/2026, 2:08:21 pm
1class Solution {
2    public int countCommas(int n) {
3        int c = 0;
4        for (int i = 0; i <= n; i++) {
5            String s = i + "";
6            int d = s.length();
7            if (d > 3) {
8                c += (d - 1) / 3;
9            }
10        }
11        return c;
12    }
13}