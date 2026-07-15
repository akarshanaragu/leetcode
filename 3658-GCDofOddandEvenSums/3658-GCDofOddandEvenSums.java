// Last updated: 15/7/2026, 9:26:34 am
1class Solution {
2    public int gcd(int a, int b) {
3        if (b == 0) {
4            return a;
5        }
6        return gcd(b, a % b);
7    }
8
9    public int gcdOfOddEvenSums(int n) {
10        int sum1 = 0, sum2 = 0;
11        for (int i = 1; i <= n * 2; i++) {
12            if (i % 2 == 0) {
13                sum1 += i;
14            } else {
15                sum2 += i;
16            }
17        }
18
19        return gcd(sum1, sum2);
20    }
21}