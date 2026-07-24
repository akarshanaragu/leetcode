// Last updated: 24/7/2026, 11:12:30 pm
1class Solution {
2    List<List<String>> ans = new ArrayList<>();
3    char b[][];
4    Set<Integer> c = new HashSet<>();
5    Set<Integer> d1 = new HashSet<>();
6    Set<Integer> d2 = new HashSet<>();
7
8    public int totalNQueens(int n) {
9        b = new char[n][n];
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < n; j++) {
13                b[i][j] = '.';
14            }
15        }
16
17        backtracking(0, n);
18        return ans.size();
19    }
20
21    void backtracking(int r, int n) {
22        if (r == n) {
23            List<String> l = new ArrayList<>();
24
25            for (int i = 0; i < n; i++) {
26                l.add(new String(b[i]));
27            }
28
29            ans.add(l);
30            return;
31        }
32
33        for (int j = 0; j < n; j++) {
34            if (!c.contains(j) &&
35                !d1.contains(r + j) &&
36                !d2.contains(r - j)) {
37
38                b[r][j] = 'Q';
39
40                c.add(j);
41                d1.add(r + j);
42                d2.add(r - j);
43
44                backtracking(r + 1, n);
45
46                b[r][j] = '.';
47
48                c.remove(j);
49                d1.remove(r + j);
50                d2.remove(r - j);
51            }
52        }
53    }
54}