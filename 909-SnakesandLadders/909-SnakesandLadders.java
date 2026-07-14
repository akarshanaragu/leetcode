// Last updated: 14/7/2026, 2:53:36 pm
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        long sum = 0;
7        long ans = 0;
8
9        int left = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12
13            sum += nums[right];
14            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
15
16            if (right - left + 1 > k) {
17                sum -= nums[left];
18                if (map.get(nums[left]) > 1) {
19                    int x = map.get(nums[left]);
20                    map.put(nums[left], x - 1);
21                } else {
22                    map.remove(nums[left]);
23                }
24                left++;
25            }
26
27
28            if (right - left + 1 == k && map.size() == k) {
29                ans = Math.max(ans, sum);
30            }
31
32        }
33
34        return ans;
35    }
36}