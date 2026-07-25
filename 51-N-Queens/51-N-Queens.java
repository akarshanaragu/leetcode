// Last updated: 25/7/2026, 10:49:55 pm
1class Solution {
2
3    List<List<String>> ans = new ArrayList<>();
4    char[][] board;
5    Set<Integer> c = new HashSet<>();
6    Set<Integer> d1 = new HashSet<>();
7    Set<Integer> d2 = new HashSet<>();
8
9    public List<List<String>> solveNQueens(int n) {
10
11        board = new char[n][n];
12
13        for (int i = 0; i < n; i++) {
14            for (int j = 0; j < n; j++) {
15
16                board[i][j] = '.';
17
18            }
19        }
20        solve(0, n);
21        return ans;
22    }
23
24    void solve(int row, int n) {
25
26        if (row == n) {
27
28            List<String> temp = new ArrayList<>();
29
30            for (int i = 0; i < n; i++) {
31                temp.add(new String(board[i]));
32            }
33            ans.add(temp);
34            return;
35        }
36
37        for (int col = 0; col < n; col++) {
38
39            if (!(c.contains(col) || d1.contains(row + col) || d2.contains(row - col))) {
40
41                board[row][col] = 'Q';
42
43                c.add(col);
44                d1.add(row + col);
45                d2.add(row - col);
46
47                solve(row + 1, n);
48
49                board[row][col] = '.';
50
51                c.remove(col);
52                d1.remove(row + col);
53                d2.remove(row - col);
54                
55            }
56        }
57    }
58}