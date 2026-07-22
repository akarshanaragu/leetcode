// Last updated: 22/7/2026, 10:28:28 am
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if (n == 1) {
4            return true;
5        }
6        if (n == 0 || n % 4 != 0) {
7            return false;
8        }
9
10        return isPowerOfFour(n / 4);
11    }
12}