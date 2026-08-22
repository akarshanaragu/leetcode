// Last updated: 22/8/2026, 2:09:39 pm
1class Solution {
2    public int maximumGap(String sk, String st) {
3        int n = sk.length(), m = st.length(), j = 0, ans = 0;
4        int l[] = new int[n];
5        int r[] = new int[n];
6
7        for (int i = 0; i < n; i++) {
8            while (sk.charAt(i) != st.charAt(j)) {
9                j++;
10            }
11            l[i] = j;
12            j++;
13        }
14
15        j = m - 1;
16        for (int i = n - 1; i >= 0; i--) {
17            while (sk.charAt(i) != st.charAt(j)) {
18                j--;
19            }
20
21            r[i] = j;
22            j--;
23
24        }
25
26        for (int i = 0; i < n - 1; i++) {
27            ans = Math.max(ans, r[i + 1] - l[i]);
28        }
29
30        return ans;
31
32    }
33}