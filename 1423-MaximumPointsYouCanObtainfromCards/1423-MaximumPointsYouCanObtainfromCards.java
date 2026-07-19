// Last updated: 19/7/2026, 7:35:32 pm
1class Solution {
2    public int maxScore(int[] c, int k) {
3        int n = c.length;
4        int l = 0, sum = 0, min = Integer.MAX_VALUE, Tsum = 0;
5        for (int i = 0; i < n; i++) {
6            Tsum += c[i];
7        }
8        if (n == k)
9            return Tsum;
10
11        for (int r = 0; r < n; r++) {
12            sum += c[r];
13            while (r - l + 1 > n - k) {
14                sum -= c[l];
15                l++;
16            }
17            if (r - l + 1 == n - k)
18                min = Math.min(min, sum);
19        }
20
21        return Tsum - min;
22
23    }
24}