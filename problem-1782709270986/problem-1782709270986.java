// Last updated: 29/6/2026, 10:31:10 am
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int ans = 0;
4        for (String str : patterns) {
5            if (word.indexOf(str) != -1)
6                ans++;
7        }
8        return ans;
9    }
10}