// Last updated: 5/6/2026, 11:40:20 am
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3
4        int n = nums.length;
5        int arr[] = new int[2 * n];
6        for (int i = 0; i < n; i++) {
7            arr[i] = nums[i];
8            arr[i + n] = nums[i];
9        }
10        return arr;
11    }
12}