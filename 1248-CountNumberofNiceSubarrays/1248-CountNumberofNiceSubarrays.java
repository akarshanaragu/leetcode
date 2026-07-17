// Last updated: 17/7/2026, 10:02:44 am
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return atmost(nums, k) - atmost(nums, k - 1);
4    }
5
6    public int atmost(int[] arr, int k) {
7        int l = 0, res = 0, odd = 0;
8        for (int r = 0; r < arr.length; r++) {
9            if (arr[r] % 2 != 0) {
10                odd++;
11            }
12            while (odd > k) {
13                if (arr[l] % 2 != 0) {
14                    odd--;
15                }
16                l++;
17            }
18            res += r - l + 1;
19        }
20        return res;
21    }
22}
23