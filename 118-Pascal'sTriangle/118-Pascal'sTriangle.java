// Last updated: 5/8/2026, 9:58:35 pm
1class Solution {
2    
3    public List<List<Integer>> generate(int r) {
4
5        List<List<Integer>> res = new ArrayList<>();
6
7        for (int i = 0; i < r; i++) {
8
9            List<Integer> row = new ArrayList<>();
10            int num = 1;
11
12            for (int j = 0; j <= i; j++) {
13                row.add(num);
14                num = num * (i - j) / (j + 1);
15            }
16
17            res.add(row);
18        }
19
20        return res;
21    }
22}