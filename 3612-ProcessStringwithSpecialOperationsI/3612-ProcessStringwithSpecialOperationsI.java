// Last updated: 16/6/2026, 9:14:26 am
1class Solution {
2    public String processStr(String s) {
3        StringBuilder res = new StringBuilder();
4        for (int i = 0; i < s.length(); i++) {
5            if (s.charAt(i) == '*') {
6                if (res.length() > 0)
7                    res.deleteCharAt(res.length() - 1);
8            } else if (s.charAt(i) == '#') {
9                res.append(res);
10            } else if (s.charAt(i) == '%') {
11                res.reverse();
12            } else {
13                res.append(s.charAt(i));
14            }
15        }
16
17        return res.toString();
18    }
19}