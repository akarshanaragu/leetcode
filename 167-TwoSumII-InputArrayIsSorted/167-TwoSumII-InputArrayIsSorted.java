// Last updated: 12/6/2026, 11:25:50 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for (int i = 0; i < nums.length; i++) {
4            int find = target - nums[i];
5            int l = i + 1;
6            int r = nums.length - 1;
7            while (l <= r) {
8                int m = l + (r - l) / 2;
9                if (nums[m] == find) {
10                    return new int[] { i + 1, m + 1 };
11                } else if (nums[m] < find) {
12                    l = m + 1;
13                } else {
14                    r = m - 1;
15                }
16            }
17        }
18        return new int[] { -1, -1 };
19    }
20}