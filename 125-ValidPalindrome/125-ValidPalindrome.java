// Last updated: 23/7/2026, 11:27:37 am
1class Solution {
2    public boolean rec(String s, int l, int r) {
3        if (l >= r) {
4            return true;
5        }
6        if (s.charAt(l) != s.charAt(r)) {
7            return false;
8        }
9        return rec(s, l + 1, r - 1);
10    }
11
12    public boolean isPalindrome(String s) {
13        s = s.toLowerCase();
14        s = s.replaceAll("[^a-z0-9]", "");
15        return rec(s, 0, s.length() - 1);
16    }
17}