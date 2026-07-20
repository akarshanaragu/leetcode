// Last updated: 20/7/2026, 11:27:45 pm
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3
4        if (n == 1)
5            return true;
6        if (n <= 0 || n % 2 != 0)
7            return false;
8
9        return isPowerOfTwo(n / 2);
10    }
11}