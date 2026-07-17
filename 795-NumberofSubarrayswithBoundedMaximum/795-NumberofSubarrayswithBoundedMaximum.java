// Last updated: 17/7/2026, 10:20:16 am
1class Solution {
2    public int numSubarrayBoundedMax(int[] arr, int left, int right) {
3        return ans(arr, right) - ans(arr, left - 1);
4    }
5
6    public int ans(int arr[], int k) {
7        int l = 0, res = 0;
8        for (int r = 0; r < arr.length; r++) {
9            if (arr[r] > k) {
10                l = r + 1;
11            }
12            res += r - l + 1;
13        }
14        return res;
15    }
16}