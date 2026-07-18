// Last updated: 18/7/2026, 11:18:05 pm
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int x = Math.abs(nums[i]) - 1;
7
8            if (nums[x] < 0) {
9                ans.add(Math.abs(nums[i]));
10            } else {
11                nums[x] = -nums[x];
12            }
13        }
14
15        return ans;
16    }
17}