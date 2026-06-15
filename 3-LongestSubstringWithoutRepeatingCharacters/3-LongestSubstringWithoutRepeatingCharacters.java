// Last updated: 16/6/2026, 12:01:59 am
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int len = s.length();
4        int left = 0, ans = 0;
5
6        HashSet<Character> hs = new HashSet<>();
7        for (int right = 0; right < len; right++) {
8            while (hs.contains(s.charAt(right))) {
9                hs.remove(s.charAt(left));
10                left++;
11            }
12            hs.add(s.charAt(right));
13            ans = Math.max(ans, right - left + 1);}
14
15        return ans;
16    }
17}