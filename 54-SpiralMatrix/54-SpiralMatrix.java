// Last updated: 18/6/2026, 11:13:43 pm
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int left = 0, top = 0;
4        int right = matrix[0].length - 1;
5        int bottom = matrix.length - 1;
6
7        ArrayList<Integer> res = new ArrayList<>();
8
9        while (top <= bottom && left <= right) {
10
11            for (int i = left; i <= right; i++) {
12                res.add(matrix[top][i]);
13            }
14            top++;
15
16            for (int i = top; i <= bottom; i++) {
17                res.add(matrix[i][right]);
18            }
19            right--;
20
21            if (top <= bottom) {
22                for (int i = right; i >= left; i--) {
23                    res.add(matrix[bottom][i]);
24                }
25                bottom--;
26            }
27
28            if (left <= right) {
29                for (int i = bottom; i >= top; i--) {
30                    res.add(matrix[i][left]);
31                }
32                left++;
33            }
34        }
35        return res;
36    }
37}