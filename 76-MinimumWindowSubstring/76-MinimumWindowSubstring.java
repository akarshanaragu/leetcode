// Last updated: 24/9/2026, 3:15:19 pm
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        int[] freq = new int[128];

        for (char c : t.toCharArray())
            freq[c]++;
        int l = 0, st = 0, count = t.length();
        int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {

            if (freq[s.charAt(r)] > 0)
                count--;
                
            freq[s.charAt(r)]--;

            while (count == 0) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    st = l;
                }

                freq[s.charAt(l)]++;

                if (freq[s.charAt(l)] > 0)
                    count++;

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(st, st + minLen);
    }
}