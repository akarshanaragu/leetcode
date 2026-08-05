// Last updated: 5/8/2026, 10:53:35 pm
1class Solution {
2
3    public List<Integer> getRow(int rowIndex) {
4
5        int n = rowIndex;
6        long num = 1;
7
8        List<Integer> row = new ArrayList<>();
9
10        for (int j = 0; j <= n; j++) {
11
12            row.add((int) num);
13            num = num * (n - j) / (j + 1);
14        }
15
16        return row;
17    }
18}