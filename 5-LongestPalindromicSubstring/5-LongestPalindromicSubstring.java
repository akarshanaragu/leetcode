// Last updated: 6/4/2026, 10:35:54 AM
class Solution {
    public String longestPalindrome(String s) {

        int len = s.length();
        String ans = "";

        for (int i = 0; i < len; i++) {

            int left = i;
            int right = i;

            while (left >= 0 && right < len &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            String cur = s.substring(left + 1, right);

            if (cur.length() > ans.length()) {
                ans = cur;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < len &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            cur = s.substring(left + 1, right);

            if (cur.length() > ans.length()) {
                ans = cur;
            }
        }

        return ans;
    }
}