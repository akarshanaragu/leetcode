// Last updated: 23/7/2026, 11:13:28 am
1class Solution {
2    public void rec(int arr[],int i) {
3        if (i == arr.length) {
4            return;
5        }
6        arr[i] += arr[i - 1];
7        rec(arr, i + 1);
8    }
9
10    public int[] runningSum(int[] nums) {
11        if (nums.length > 1) {
12            rec(nums, 1);
13        }
14        return nums;
15    }
16}