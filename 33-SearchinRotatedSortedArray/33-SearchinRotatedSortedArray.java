// Last updated: 12/6/2026, 10:39:03 pm
1class Solution {
2    public int search(int[] nums, int target) {
3        int l = 0, r = nums.length - 1;
4        while (l <= r) {
5            int m = l + (r - l) / 2;
6            if (nums[m] == target) return m;
7
8            if (nums[m] >= nums[l]) {
9                if (target >= nums[l] && target < nums[m]) {
10                    r = m - 1;
11                } else {
12                    l = m + 1;
13                }
14            } 
15            else {
16                if (target > nums[m] && target <= nums[r]) {
17                    l = m + 1;
18                } else {
19                    r = m - 1;
20                }
21            }
22        }
23        return -1;
24    }
25}