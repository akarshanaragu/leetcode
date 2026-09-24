// Last updated: 24/9/2026, 3:16:41 pm
class Solution {

    public String longestCommonPrefix(String[] strs) {

        String s1 = strs[0];
        StringBuilder st = new StringBuilder();

        for (int j = 0; j < strs[0].length(); j++) {

            char ch = s1.charAt(j);

            for (int i = 1; i < strs.length; i++) {

                String s = strs[i];

                if (j >= s.length() || s.charAt(j) != ch) {
                    return st.toString();
                }

            }

            st.append(ch);
            
        }

        return st.toString();
    }

}