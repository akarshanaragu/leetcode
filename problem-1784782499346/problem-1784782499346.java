// Last updated: 23/7/2026, 10:24:59 am
1class Solution {
2    public int step(int num) {
3
4        if (num == 0) {
5            return 0;
6        }
7
8        if (num % 2 == 0) {
9            return 1 + step(num / 2);
10        }
11
12        return 1 + step(num - 1);
13
14    }
15
16    public int numberOfSteps(int num) {
17
18        return step(num);
19    }
20}