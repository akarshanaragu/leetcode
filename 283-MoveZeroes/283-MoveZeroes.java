// Last updated: 4/6/2026, 9:52:17 pm
1class Solution {
2    public void moveZeroes(int[] arr) {
3
4        int l = 0;
5        
6        for (int r = 0; r < arr.length; r++) {
7
8            if (arr[r] != 0) {
9                int temp = arr[r];
10                arr[r] = arr[l];
11                arr[l] = temp;
12                l++;
13            }
14
15        }
16    }
17}