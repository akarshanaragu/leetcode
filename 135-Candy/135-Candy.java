// Last updated: 13/7/2026, 2:49:03 pm
1class Solution {
2    public int candy(int[] rt) {
3        int n = rt.length;
4        int count = 0;
5        int c[] = new int[n];
6        for (int i = 0; i < n; i++) {
7            c[i] = 1;
8        }
9
10        for (int i = 1; i < n; i++) {
11            if (rt[i] > rt[i - 1]) {
12                c[i] = c[i - 1] + 1;
13            }
14        }
15
16        for (int i = n - 1; i > 0; i--) {
17            if (rt[i] < rt[i - 1]) {
18                c[i - 1] = Math.max(c[i - 1], c[i] + 1);
19            }
20        }
21
22        for (int i = 0; i < n; i++) {
23            count += c[i];
24        }
25
26        return count;
27
28    }
29}