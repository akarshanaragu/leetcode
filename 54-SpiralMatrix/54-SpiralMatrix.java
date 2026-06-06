// Last updated: 6/6/2026, 10:42:27 pm
1class Solution {
2    public List<Integer> spiralOrder(int[][] a) {
3        int l = 0, t = 0;
4        int r = a[0].length - 1;
5        int b = a.length - 1;
6        ArrayList<Integer> res = new ArrayList<>();
7        while (t <= b && l <= r) {
8
9            for (int i = l; i <= r; i++) {
10                res.add(a[t][i]);
11            }
12            t++;
13
14            for (int i = t; i <= b; i++) {
15                res.add(a[i][r]);
16            }
17            r--;
18
19            if (t <= b) {
20                for (int i = r; i >= l; i--) {
21                    res.add(a[b][i]);
22                }
23                b--;
24            }
25
26            if (l <= r) {
27                for (int i = b; i >= t; i--) {
28                    res.add(a[i][l]);
29                }
30                l++;
31            }
32        }
33        return res;
34    }
35}