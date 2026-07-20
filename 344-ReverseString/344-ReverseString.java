// Last updated: 20/7/2026, 2:01:49 pm
1class Solution {
2    public void reverse(char[] s, int l, int r) {
3        if (l >= r) {
4            return;
5        }
6        char t = s[l]; s[l] = s[r]; s[r] = t;
7        l++; r--;
8        reverse(s, l, r);
9    }
10
11    public void reverseString(char[] s) {
12        reverse(s, 0, s.length - 1);
13    }
14}