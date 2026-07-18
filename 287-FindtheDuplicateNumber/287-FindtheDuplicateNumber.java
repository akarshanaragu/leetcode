// Last updated: 18/7/2026, 11:56:29 pm
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n = nums.length;
4        int start = 1, end = n - 1;
5
6        while (start < end) {
7            int mid = (start + end) / 2;
8            int c = 0;
9
10            for (int i : nums) {
11                if (i <= mid) {
12                    c++;
13                }
14            }
15
16            if (c > mid)
17                end = mid;
18            else
19                start = mid + 1;
20        }
21
22        return start;
23    }
24}