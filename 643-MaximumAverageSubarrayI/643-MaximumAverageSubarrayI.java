// Last updated: 13/6/2026, 11:57:50 pm
1class Solution {
2    public double findMaxAverage(int[] a, int k) {
3        int n = a.length;
4        int sum = 0;
5        for (int i = 0; i < k; i++) 
6            sum += a[i];
7        int max = sum;
8
9        for (int i = k; i < n; i++) {
10            sum = sum - a[i - k] + a[i];
11            max = Math.max(max, sum);
12        }
13
14
15        return (double) max / k;
16    }
17}