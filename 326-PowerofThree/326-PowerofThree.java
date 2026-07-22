// Last updated: 22/7/2026, 10:23:50 am
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n == 1)
4            return true;
5        if (n <= 0 || n % 3 != 0) {
6            return false;
7        }
8
9        return isPowerOfThree(n / 3);
10    }
11}