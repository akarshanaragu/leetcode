// Last updated: 23/7/2026, 11:41:16 am
1class Solution {
2    public boolean validPalindrome(String s) {
3        int l = 0, r = s.length() - 1;
4        while (l < r) {
5            if (s.charAt(l) == s.charAt(r)) {
6                l++;
7                r--;
8            } else {
9                return is(s, l + 1, r) || is(s, l, r - 1);
10            }
11        }
12        return true;
13    }
14
15    public boolean is(String s, int l, int r) {
16        while (l < r) {
17            if (s.charAt(l) != s.charAt(r)) {
18                return false;
19            }
20            l++;
21            r--;
22        }
23        return true;
24    }
25}