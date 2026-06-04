// Last updated: 4/6/2026, 11:30:50 pm
1class Solution {
2    public boolean check(int[] a) {
3
4        int n = a.length;
5        int c = 0;
6
7        for (int i = 0; i < n; i++) {
8
9            if (a[i] > a[(i + 1) % n]) {
10                c++;
11            }
12
13        }
14
15        return c <= 1;
16    }
17}