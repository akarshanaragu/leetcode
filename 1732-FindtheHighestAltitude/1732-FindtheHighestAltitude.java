// Last updated: 19/6/2026, 9:53:54 am
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] p = new int[gain.length + 1];
4        p[0] = 0;
5        int max = p[0];
6        for (int i = 1; i <= gain.length; i++) {
7            p[i] = p[i - 1] + gain[i - 1];
8            max = Math.max(max, p[i]);
9        }
10        return max;
11    }
12}