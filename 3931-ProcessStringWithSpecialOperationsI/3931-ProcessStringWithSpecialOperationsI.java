// Last updated: 20/7/2026, 9:22:39 am
class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (res.length() > 0)
                    res.deleteCharAt(res.length() - 1);
            } else if (s.charAt(i) == '#') {
                res.append(res);
            } else if (s.charAt(i) == '%') {
                res.reverse();
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}