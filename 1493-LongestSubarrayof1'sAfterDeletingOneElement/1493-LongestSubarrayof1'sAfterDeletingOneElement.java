// Last updated: 16/7/2026, 12:35:05 pm
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int n = nums.length;
4        int z = 0, max = 0, l = 0, len = 0;
5        for (int r = 0; r < n; r++) {
6            if (nums[r] == 0) {
7                z++;
8            }
9            while (z > 1) {
10                if (nums[l] == 0)
11                    z--;
12                l++;
13            }
14            len = r - l;
15            max = Math.max(len, max);
16        }
17        return max;
18    }
19}