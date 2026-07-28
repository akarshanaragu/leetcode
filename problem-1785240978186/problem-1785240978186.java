// Last updated: 28/7/2026, 5:46:18 pm
1class Solution {
2    public String smallestPalindrome(String s) {
3        if (s.length() < 2) {
4            return s;
5        }
6
7        HashMap<Character, Integer> map = new HashMap<>();
8        for (int i = 0; i < s.length(); i++) {
9            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
10        }
11
12        StringBuilder st = new StringBuilder();
13        char mid = 0;
14        
15        for (char ch : map.keySet()) {
16            for (int i = 0; i < map.get(ch) / 2; i++) {
17                st.append(ch);
18            }
19
20            if (map.get(ch) % 2 == 1) {
21                mid = ch;
22            }
23        }
24
25        char[] arr = st.toString().toCharArray();
26        Arrays.sort(arr);
27        StringBuilder res = new StringBuilder();
28        for (char ch : arr) {
29            res.append(ch);
30        }
31
32        if (mid != 0) {
33            return res.toString() + mid + res.reverse().toString();
34        }
35        return res.toString() + res.reverse().toString();
36
37    }
38}