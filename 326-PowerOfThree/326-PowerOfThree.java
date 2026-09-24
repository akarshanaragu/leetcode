// Last updated: 24/9/2026, 3:12:35 pm
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }
}