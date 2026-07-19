// Last updated: 19/7/2026, 11:57:16 pm
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length())
5            return "";
6
7        int[] freq = new int[128];
8
9        for (char c : t.toCharArray())
10            freq[c]++;
11        int l = 0, st = 0, count = t.length();
12        int minLen = Integer.MAX_VALUE;
13
14        for (int r = 0; r < s.length(); r++) {
15
16            if (freq[s.charAt(r)] > 0)
17                count--;
18                
19            freq[s.charAt(r)]--;
20
21            while (count == 0) {
22
23                if (r - l + 1 < minLen) {
24                    minLen = r - l + 1;
25                    st = l;
26                }
27
28                freq[s.charAt(l)]++;
29
30                if (freq[s.charAt(l)] > 0)
31                    count++;
32
33                l++;
34            }
35        }
36
37        return minLen == Integer.MAX_VALUE ? "" : s.substring(st, st + minLen);
38    }
39}