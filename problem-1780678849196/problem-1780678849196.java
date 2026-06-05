// Last updated: 5/6/2026, 10:30:49 pm
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        for (int r = 0; r < n; r++) {
6            for (int c = r + 1; c < n; c++) {
7                int temp = matrix[r][c];
8                matrix[r][c] = matrix[c][r];
9                matrix[c][r] = temp;
10            }
11        }
12
13        for (int r = 0; r < n; r++) {
14            int left = 0;
15            int right = n - 1;
16
17            while (left < right) {
18                int temp = matrix[r][left];
19                matrix[r][left] = matrix[r][right];
20                matrix[r][right] = temp;
21
22                left++;
23                right--;
24            }
25        }
26    }
27}