// Last updated: 26/7/2026, 11:18:04 pm
1class Solution {
2
3    public int[] productExceptSelf(int[] nums) {
4
5        int n = nums.length;
6        int[] ans = new int[n];
7        int product = 1;
8
9        for (int i = 0; i < n; i++) {
10            ans[i] = product;
11            product *= nums[i];
12        }
13
14        product = 1;
15
16        for (int i = n - 1; i >= 0; i--) {
17            ans[i] *= product;
18            product *= nums[i];
19        }
20
21        return ans;
22    }
23}