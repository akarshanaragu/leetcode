// Last updated: 15/7/2026, 12:20:44 pm
1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        int l = 0, max = 0, f = 0;
5        for (int r = 0; r < s.length(); r++) {
6            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
7            f = Math.max(f, map.get(s.charAt(r)));
8            if ((r - l + 1) - f > k) {
9                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
10
11                if (map.get(s.charAt(l)) == 0)
12                    map.remove(s.charAt(l));
13                l++;
14            }
15            max = Math.max(r - l + 1, max);
16        }
17        return max;
18    }
19}