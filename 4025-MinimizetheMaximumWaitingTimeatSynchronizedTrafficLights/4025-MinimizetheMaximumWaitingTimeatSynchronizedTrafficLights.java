// Last updated: 22/8/2026, 9:45:51 am
1class Solution {
2    public int minPenalty(int p, int[] l, int[] a) {
3        int max = 0, ans = 0;
4        for (int i = 0; i < l.length; i++) {
5            max = Math.max(max, l[i]);
6        }
7        for (int i = 0; i < a.length; i++) {
8            if (a[i]%p >= max) 
9                ans = Math.max(p-(a[i]%p), ans);
10        }
11        return ans;
12    }
13}