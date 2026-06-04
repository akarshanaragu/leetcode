// Last updated: 4/6/2026, 11:16:01 pm
1class Solution {
2
3    public void rotate(int[] a, int k) {
4
5        k %= a.length;
6
7        rev(a, 0, a.length - 1);
8        rev(a, 0, k - 1);
9        rev(a, k, a.length - 1);
10    }
11
12    public void rev(int[] a, int l, int r) {
13
14        while (l < r) {
15
16            int t = a[l];
17            a[l] = a[r];
18            a[r] = t;
19
20            l++;
21            r--;
22        }
23    }
24}