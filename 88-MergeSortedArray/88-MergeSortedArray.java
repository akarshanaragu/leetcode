// Last updated: 6/6/2026, 11:53:43 pm
1class Solution {
2    public void merge(int[] a, int m, int[] b, int n) {
3        int[] t = new int[m + n];
4
5        for (int i = 0; i < m; i++) {
6            t[i] = a[i];
7        }
8
9        int k = 0;
10        for (int i = m; i < m + n; i++) {
11            t[i] = b[k++];
12        }
13
14        Arrays.sort(t);
15
16        for (int i = 0; i < m + n; i++) {
17            a[i] = t[i];
18        }
19    }
20}