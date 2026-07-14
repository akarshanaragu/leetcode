// Last updated: 14/7/2026, 11:16:46 pm
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3
4        int l = 0, z = 0, ans = 0;
5
6        for (int r = 0; r < nums.length; r++) {
7
8            if (nums[r] == 0)
9                z++;
10
11            while (z > k) {
12                if (nums[l] == 0)
13                    z--;
14                l++;
15            }
16            ans = Math.max(ans, r - l + 1);
17        }
18
19        return ans;
20    }
21}