// Last updated: 16/6/2026, 9:48:47 am
1class Solution {
2    public List<List<Integer>> generate(int n) {
3
4        List<List<Integer>> res = new ArrayList<>();
5
6        for (int i = 0; i < n; i++) {
7
8            List<Integer> l = new ArrayList<>();
9
10            l.add(1);
11
12            if (i > 0) {
13                List<Integer> prev = res.get(i - 1);
14                for (int j = 1; j < i; j++) {
15                    l.add(prev.get(j-1)+prev.get(j));
16                }
17                l.add(1);
18            }
19            res.add(l);
20        }
21
22        return res;
23    }
24}