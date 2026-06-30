// Last updated: 30/6/2026, 11:38:46 am
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] count = new int[3]; // a, b, c
4        int l = 0, ans = 0;
5
6        for(int r = 0; r < s.length(); r++) {
7            count[s.charAt(r) - 'a']++;
8
9            while(count[0] > 0 && count[1] > 0 && count[2] > 0) {
10                ans += s.length() - r;
11                count[s.charAt(l) - 'a']--;
12                l++;
13            }
14        }
15        return ans;
16    }
17}