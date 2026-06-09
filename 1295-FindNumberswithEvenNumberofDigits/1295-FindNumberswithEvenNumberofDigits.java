// Last updated: 9/6/2026, 9:15:40 am
1class Solution {
2    public int len(int n) {
3        int temp = n;
4        int c = 0;
5        while (temp > 0) {
6            c++;
7            temp = temp / 10;
8        }
9        return c;
10    }
11
12    public int findNumbers(int[] nums) {
13        int count = 0;
14        for (int i = 0; i < nums.length; i++) {
15            int a = len(nums[i]);
16            if (a % 2 == 0) {
17                count++;
18            }
19        }
20        return count;
21    }
22}