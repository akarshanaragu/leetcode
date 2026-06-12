// Last updated: 12/6/2026, 10:00:05 pm
1class Solution {
2    public int findPeakElement(int[] nums) {
3
4        int s = 0;
5        int e = nums.length - 1;
6
7        while (s < e) {
8
9            int m = (s + e) / 2;
10
11            if (nums[m] > nums[m + 1]) {
12                e = m;
13            } else {
14                s = m + 1;
15            }
16        }
17
18        return s;
19    }
20}