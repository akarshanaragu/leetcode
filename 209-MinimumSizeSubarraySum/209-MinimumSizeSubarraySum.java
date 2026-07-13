// Last updated: 13/7/2026, 10:50:04 pm
1class Solution {
2    public int minSubArrayLen(int t, int[] arr) {
3
4        int min = Integer.MAX_VALUE;
5        int sum = 0, l = 0;
6
7        for (int j = 0; j < arr.length; j++) {
8            
9            sum += arr[j];
10
11            while (sum >= t) {
12                min = Math.min(min, j - l + 1);
13                sum -= arr[l];
14                l++;
15            }
16
17        }
18
19        return min == Integer.MAX_VALUE ? 0 : min;
20    }
21}