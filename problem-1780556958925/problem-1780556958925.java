// Last updated: 6/4/2026, 12:39:18 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int a = 0;
4        for (int j = 0; j < nums.length; j++) {
5            if (nums[a] != nums[j]) {
6                a++;
7                nums[a] = nums[j];
8            }
9        }
10        return a + 1;
11    }
12}