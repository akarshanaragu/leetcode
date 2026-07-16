// Last updated: 16/7/2026, 12:21:02 pm
1class Solution {
2    public boolean isv(char ch) {
3        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
4    }
5
6    public int maxVowels(String s, int k) {
7        int count = 0, max = 0, n = s.length();
8        for (int i = 0; i < k; i++) {
9            if (isv(s.charAt(i))) {
10                count++;
11            }
12        }
13        max = count;
14        for (int i = 1; i < n - k + 1; i++) {
15            if (isv(s.charAt(i - 1))) {
16                count--;
17            }
18            if (isv(s.charAt(i + k - 1))) {
19                count++;
20            }
21            max = Math.max(count, max);
22        }
23        return max;
24    }
25}