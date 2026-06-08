// Last updated: 8/6/2026, 11:31:17 pm
1class Solution {
2    public int maxSubArray(int[] arr) {
3
4        int sum = arr[0];
5        int ans = arr[0];
6
7        for (int i = 1; i < arr.length; i++) {
8
9            sum = Math.max(sum + arr[i], arr[i]);
10
11            ans = Math.max(ans, sum);
12        }
13
14        return ans;
15    }
16}