// Last updated: 9/6/2026, 12:10:08 pm
1class Solution {
2    public int mySqrt(int x) {
3        int l = 1;
4        int r = x;
5        int res = 0;
6        while (l <= r) {
7            int mid = l + (r - l) / 2;
8            long a = (long) mid * mid;
9            if (a == x) {
10                return mid;
11            } else if (a < x) {
12                res = mid;
13                l = mid + 1;
14            } else {
15
16                r = mid - 1;
17            }
18        }
19        return res;
20    }
21}