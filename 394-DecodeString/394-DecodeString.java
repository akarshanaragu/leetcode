// Last updated: 16/6/2026, 11:41:28 pm
1class Solution {
2
3    int i = 0;
4    public String decodeString(String s) {
5        StringBuilder res = new StringBuilder();
6
7        while (i < s.length() && s.charAt(i) != ']') {
8
9            if (Character.isLetter(s.charAt(i))) {
10                res.append(s.charAt(i));
11                i++;
12            } else {
13                int num = 0;
14                while (Character.isDigit(s.charAt(i))) {
15                    num = num * 10 + (s.charAt(i) - '0');
16                    i++;
17                } i++;
18                String inner = decodeString(s); i++;
19                for (int j = 0; j < num; j++) {
20                    res.append(inner);
21                }
22            }
23        }
24
25        return res.toString();
26    }
27}