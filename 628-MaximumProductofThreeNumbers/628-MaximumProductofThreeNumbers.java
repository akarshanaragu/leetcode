// Last updated: 26/7/2026, 10:25:20 pm
1class Solution {
2    public int maximumProduct(int[] nums) {
3
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        int a = nums[0] * nums[1] * nums[n - 1];
8        int b = nums[n - 1] * nums[n - 2] * nums[n - 3];
9
10        return Math.max(a, b);
11    }
12}