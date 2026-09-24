// Last updated: 24/9/2026, 3:10:06 pm
class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else
                    st.push(ch);
            } 
            else {
                st.push(ch);
            }

        }
        
        return st.size();
    }
}