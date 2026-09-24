// Last updated: 24/9/2026, 3:11:49 pm
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-')
                st.append(s.charAt(i));
        }
        int n = st.length();

        int a = n % k;
        StringBuilder ans = new StringBuilder();
        if (a == 0) {
            for (int i = 0; i < n; i++) {
                if (i == k || i % k == 0 && i != 0) {
                    ans.append("-");
                }
                ans.append(st.charAt(i));
            }
            return ans.toString();
        }
        for (int i = 0; i < st.length(); i++) {
            if (a != 0 && i == a) {
                ans.append("-");
                break;
            }
            ans.append(st.charAt(i));
        }
        int c = 0;
        for (int i = a; i < st.length(); i++) {
            ans.append(st.charAt(i));
            c++;
            if(i==st.length()-1){
                break;
            }
            if (c == k || c % k == 0 ) {
                ans.append("-");
            }
        }
        return ans.toString();
    }
}