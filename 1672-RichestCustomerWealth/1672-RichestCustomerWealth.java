// Last updated: 25/7/2026, 11:44:52 pm
1class Solution {
2    public int maximumWealth(int[][] a) {
3        int m = 0;
4        for (int i = 0; i < a.length; i++) {
5
6            int sum = 0;
7
8            for (int j = 0; j < a[i].length; j++) {
9                sum += a[i][j];
10            }
11
12            m = Math.max(sum, m);
13        }
14
15        return m;
16    }
17}