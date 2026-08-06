// Last updated: 6/8/2026, 11:11:11 pm
1class Solution {
2
3    public String trimTrailingVowels(String s) {
4
5        int i = s.length() - 1;
6        while (i >= 0 && isVowel(s.charAt(i))) {
7            i--;
8        }
9
10        return s.substring(0, i + 1);
11
12    }
13
14    private boolean isVowel(char ch) {
15        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
16    }
17    
18}