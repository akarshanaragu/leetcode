// Last updated: 6/4/2026, 10:31:15 AM
class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (open != 0) {
                    ans += ch;
                }
                open++;
            } else {
                if (open != 1) {
                    ans += ch;
                }
                open--;
            }
        }

        return ans;
    }
}