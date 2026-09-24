// Last updated: 24/9/2026, 3:13:09 pm
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n == 1)
            return true;
        if (n <= 0 || n % 2 != 0)
            return false;

        return isPowerOfTwo(n / 2);
    }
}