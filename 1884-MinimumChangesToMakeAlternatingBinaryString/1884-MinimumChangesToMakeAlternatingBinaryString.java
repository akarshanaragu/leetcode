// Last updated: 6/4/2026, 10:30:23 AM
class Solution {
    public int minOperations(String s) {
        int mismatchA = 0; 
        int mismatchB = 0; 

        for (int i = 0; i < s.length(); i++) {
            char expectedA = (i % 2 == 0) ? '0' : '1';

            if (s.charAt(i) != expectedA) {
                mismatchA++;
            } else {
                mismatchB++;
            }
        }

        return Math.min(mismatchA, mismatchB);
    }
}