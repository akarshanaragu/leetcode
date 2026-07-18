// Last updated: 18/7/2026, 10:49:03 pm
1class Solution {
2    public int minAddToMakeValid(String s) {
3
4        Stack<Character> st = new Stack<>();
5
6        for (char ch : s.toCharArray()) {
7
8            if (ch == ')') {
9                if (!st.isEmpty() && st.peek() == '(')
10                    st.pop();
11                else
12                    st.push(ch);
13            } 
14            else {
15                st.push(ch);
16            }
17
18        }
19        
20        return st.size();
21    }
22}