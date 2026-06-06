// Last updated: 6/6/2026, 11:11:32 pm
1class Solution {
2    public void setZeroes(int[][] a) {
3        int m = a.length;
4        int n = a[0].length;
5
6        boolean[] r = new boolean[m];
7        boolean[] c = new boolean[n];
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (a[i][j] == 0) {
12                    r[i] = true;
13                    c[j] = true;
14                }
15            }
16        }
17
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20                if (r[i] || c[j]) {
21                    a[i][j] = 0;
22                }
23            }
24        }
25    }
26}