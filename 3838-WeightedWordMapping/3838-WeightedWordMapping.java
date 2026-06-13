// Last updated: 13/6/2026, 11:22:17 pm
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans = new StringBuilder();
4        for (String word : words) {
5            int sum = 0;
6            for (char ch : word.toCharArray()) {
7                sum += weights[ch - 'a'];
8            }
9            int rem = sum % 26;
10            ans.append((char)('z' - rem));
11        }
12        
13        return ans.toString();
14    }
15}