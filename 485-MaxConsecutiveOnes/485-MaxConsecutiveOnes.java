// Last updated: 9/6/2026, 9:57:34 am
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int j = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != val) {
6                nums[j] = nums[i];
7                j++;
8            }
9        }
10        return j;
11    }
12}