// Last updated: 6/6/2026, 10:09:41 pm
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int total = 0;
6        for (int x : nums) {
7            total += x;
8        }
9        int leftSum = 0;
10        for (int i = 0; i < n; i++) {
11            total -= nums[i]; 
12            ans[i] = Math.abs(leftSum - total);
13            leftSum += nums[i];
14        }
15        return ans;
16    }
17}