// Last updated: 24/9/2026, 3:09:06 pm
class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // a, b, c
        int l = 0, ans = 0;

        for(int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'a']++;

            while(count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += s.length() - r;
                count[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return ans;
    }
}