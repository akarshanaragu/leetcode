// Last updated: 22/8/2026, 9:14:23 am
1class Solution {
2    public int nearestDrone(int[][] d, int[] t) {
3        int x1 = t[0], y1 = t[1], min = Integer.MAX_VALUE, ans = -1;
4        for (int i = 0; i < d.length; i++) {
5            int x = d[i][0], y = d[i][1], r = d[i][2];
6            int m = Math.abs(x - x1) + Math.abs(y - y1);
7            if (m <= r) {
8                if (min > m) {
9                    min = m;
10                    ans = i;
11                }
12            }
13        }
14        return ans;
15    }
16}