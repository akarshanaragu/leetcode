// Last updated: 6/4/2026, 10:30:32 AM
class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            maxDigit = Math.max(maxDigit, digit);
        }

        return maxDigit;
    }
}