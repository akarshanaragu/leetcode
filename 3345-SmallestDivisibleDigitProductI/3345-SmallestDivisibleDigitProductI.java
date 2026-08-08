// Last updated: 8/8/2026, 10:11:31 pm
1class Solution {
2
3    public int smallestNumber(int n, int t) {
4
5        while (true) {
6
7            int x = n, p = 1;
8
9            while (x > 0) {
10                p *= x % 10;
11                x /= 10;
12            }
13
14            if (p % t == 0) 
15                return n;
16
17            n++;
18        }
19
20    }
21}