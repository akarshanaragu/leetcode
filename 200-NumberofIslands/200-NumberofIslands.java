// Last updated: 27/7/2026, 10:21:35 pm
1class Solution {
2    public int numIslands(char[][] g) {
3        int res = 0;
4
5        for (int i = 0; i < g.length; i++) {
6            for (int j = 0; j < g[0].length; j++) {
7                if (g[i][j] == '1') {
8                    res++;
9                    burn(g, i, j);
10                }
11            }
12        }
13
14        return res;
15    }
16
17    static void burn(char[][] g, int i, int j) {
18        if (i < 0 || i >= g.length || 
19            j < 0 || j >= g[0].length || 
20            g[i][j] != '1') {
21            return;
22        }
23
24        g[i][j] = '0';
25
26        burn(g, i + 1, j);
27        burn(g, i - 1, j);
28        burn(g, i, j + 1);
29        burn(g, i, j - 1);
30    }
31}