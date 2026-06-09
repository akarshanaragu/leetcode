// Last updated: 9/6/2026, 9:39:19 pm
1class Solution {
2    public int peakIndexInMountainArray(int[] nums) {
3        int l = 0, r = nums.length - 1;
4
5        while (l <= r) {
6            int mid = (l + r) / 2;
7
8            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
9                return mid;
10            } 
11            else if (nums[mid] < nums[mid + 1]) {
12                l = mid + 1;
13            } 
14            else {
15                r = mid - 1;
16            }
17        }
18
19        return 0;
20    }
21}