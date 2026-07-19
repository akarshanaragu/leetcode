// Last updated: 19/7/2026, 7:20:20 pm
1class Solution {
2    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
3        int res = 0, sum = 0, n = grumpy.length, l = 0, max = 0;
4        for (int i = 0; i < grumpy.length; i++) {
5            if (grumpy[i] == 0) {
6                res += customers[i];
7            }
8        }
9        for (int r = 0; r < n; r++) {
10            if (grumpy[r] == 1)
11                sum += customers[r];
12            if (r - l + 1 > min) {
13                if (grumpy[l] == 1) {
14                    sum -= customers[l];
15                }
16                l++;
17
18            }
19            max = Math.max(sum, max);
20        }
21        res += max;
22
23        return res;
24    }
25}