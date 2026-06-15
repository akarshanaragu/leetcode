// Last updated: 15/6/2026, 6:01:26 pm
1class Solution {
2    public String convert(String s, int n) {
3        StringBuilder arr[] = new StringBuilder[n];
4        if (n == 1 || s.length() < n) {
5            return s;
6        }
7        for (int i = 0; i < n; i++) {
8            arr[i] = new StringBuilder();
9        }
10        int r = 0;
11        boolean d = true;
12
13        for (char c : s.toCharArray()) {
14            arr[r].append(c);
15
16            if (r == n - 1) {
17                d = false;
18            } else if (r == 0) {
19                d = true;
20            }
21
22            if (d) {
23                r++;
24            } else {
25                r--;
26            }
27        }
28        StringBuilder res = new StringBuilder();
29        for (StringBuilder x : arr) {
30            res.append(x);
31
32        }
33
34        return res.toString();
35    }
36}