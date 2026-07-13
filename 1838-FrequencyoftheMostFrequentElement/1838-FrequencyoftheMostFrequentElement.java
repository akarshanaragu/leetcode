// Last updated: 13/7/2026, 11:20:00 pm
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4        long sum = 0; int left = 0; int ans = 1;
5
6        for (int right = 0; right < nums.length; right++) {
7
8            sum += nums[right];
9
10            while ((long) nums[right] * (right - left + 1) - sum > k) {
11                sum -= nums[left];
12                left++;
13            }
14
15            ans = Math.max(ans, right - left + 1);
16        }
17
18        return ans;
19    }
20}