// Last updated: 10/6/2026, 11:35:15 pm
1class Solution {
2    public int[] sortedSquares(int[] arr) {
3        int len = arr.length;
4        int[] ans = new int[len];
5
6        int s = 0;
7        int e = len - 1;
8        int idx = len - 1;
9
10        while (s <= e) {
11            int leftSq = arr[s] * arr[s];
12            int rightSq = arr[e] * arr[e];
13
14            if (leftSq > rightSq) {
15                ans[idx] = leftSq;
16                s++;
17            } else {
18                ans[idx] = rightSq;
19                e--;
20            }
21
22            idx--;
23        }
24
25        return ans;
26    }
27}