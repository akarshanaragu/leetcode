// Last updated: 10/7/2026, 9:57:38 am
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s = s.toUpperCase();
4        StringBuilder st = new StringBuilder();
5
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) != '-')
8                st.append(s.charAt(i));
9        }
10        int n = st.length();
11
12        int a = n % k;
13        StringBuilder ans = new StringBuilder();
14        if (a == 0) {
15            for (int i = 0; i < n; i++) {
16                if (i == k || i % k == 0 && i != 0) {
17                    ans.append("-");
18                }
19                ans.append(st.charAt(i));
20            }
21            return ans.toString();
22        }
23        for (int i = 0; i < st.length(); i++) {
24            if (a != 0 && i == a) {
25                ans.append("-");
26                break;
27            }
28            ans.append(st.charAt(i));
29        }
30        int c = 0;
31        for (int i = a; i < st.length(); i++) {
32            ans.append(st.charAt(i));
33            c++;
34            if(i==st.length()-1){
35                break;
36            }
37            if (c == k || c % k == 0 ) {
38                ans.append("-");
39            }
40        }
41        return ans.toString();
42    }
43}