// Last updated: 5/6/2026, 10:43:51 pm
1class Solution {
2    public int maxProfit(int[] arr) {
3        int minPrice = arr[0];
4        int maxGain = 0;
5
6        for (int i = 1; i < arr.length; i++) {
7            if (arr[i] < minPrice) {
8                minPrice = arr[i];
9            } else if (arr[i] - minPrice > maxGain) {
10                maxGain = arr[i] - minPrice;
11            }
12        }
13
14        return maxGain;
15    }
16}