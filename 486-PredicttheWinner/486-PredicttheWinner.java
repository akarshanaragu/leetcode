// Last updated: 1/8/2026, 10:32:48 pm
1class Solution {
2
3    public boolean predictTheWinner(int[] nums) {
4        return solve(nums, 0, nums.length - 1) >= 0;
5    }
6
7    public int solve(int[] nums, int left, int right) {
8
9        if (left == right)
10            return nums[left];
11
12        int l = nums[left] - solve(nums, left + 1, right);
13        int r = nums[right] - solve(nums, left, right - 1);
14
15        return Math.max(l, r);
16    }
17
18}