// Last updated: 26/7/2026, 11:50:19 pm
1class Solution {
2
3    public int minOperations(String s) {
4        
5        int a = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8
9            char s1 = (i % 2 == 0) ? '0' : '1';
10
11            if (s.charAt(i) != s1) {
12                a++;
13            }
14        }
15
16        return Math.min(a, s.length() - a);
17    }
18
19}