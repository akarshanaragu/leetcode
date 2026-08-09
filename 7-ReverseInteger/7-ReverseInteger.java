// Last updated: 9/8/2026, 9:27:54 pm
1class Solution {
2    
3    public int reverse(int x) {
4
5        int r = 0;
6
7        while (x != 0) {
8
9            int d = x % 10; x /= 10;
10
11            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7))
12                return 0;
13
14            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && d < -8))
15                return 0;
16
17            r = r * 10 + d;
18
19        }
20
21        return r;
22
23    }
24
25}