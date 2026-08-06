// Last updated: 6/8/2026, 10:35:00 pm
1class Solution {
2    public boolean checkIfPangram(String s) {
3
4        HashSet<Character> set = new HashSet<>();
5        for (char ch : s.toCharArray()) {
6            set.add(ch);
7        }
8
9        return set.size() == 26;
10    }
11}