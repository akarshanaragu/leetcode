// Last updated: 24/9/2026, 3:08:47 pm
class Solution {
    public boolean isv(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0, max = 0, n = s.length();
        for (int i = 0; i < k; i++) {
            if (isv(s.charAt(i))) {
                count++;
            }
        }
        max = count;
        for (int i = 1; i < n - k + 1; i++) {
            if (isv(s.charAt(i - 1))) {
                count--;
            }
            if (isv(s.charAt(i + k - 1))) {
                count++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}