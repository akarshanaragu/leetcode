// Last updated: 17/6/2026, 11:47:41 pm
1class Solution {
2    public int maxProduct(int[] arr) {
3
4        int max = arr[0], min = arr[0], ans = arr[0];
5
6        for (int i = 1; i < arr.length; i++) {
7            int a = arr[i];
8
9            int max1 = Math.max(a, Math.max(max * a, min * a));
10            int min1 = Math.min(a, Math.min(max * a, min * a));
11
12            max = max1;min = min1;
13            ans = Math.max(ans, max);
14        }
15
16        return ans;
17    }
18}