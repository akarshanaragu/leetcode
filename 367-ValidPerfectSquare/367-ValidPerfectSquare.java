// Last updated: 9/6/2026, 12:35:37 pm
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int l = 1, r = num;
4        while (l <= r) {
5            int mid = l + (r - l) / 2;
6            long a = (long) mid * mid;
7            if (a == num)
8                return true;
9            else if (a > num)
10                r = mid - 1;
11            else
12                l = mid + 1;
13        }
14        return false;
15    }
16}