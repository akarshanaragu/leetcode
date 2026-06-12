// Last updated: 12/6/2026, 11:05:26 pm
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase();
4        s = s.replaceAll("[^a-z0-9]", "");
5
6        int i = 0, j = s.length() - 1;
7        while (i < j) {
8            if (s.charAt(i) != s.charAt(j)) {
9                return false;
10            }
11            i++;
12            j--;
13        }
14        return true;
15    }
16}