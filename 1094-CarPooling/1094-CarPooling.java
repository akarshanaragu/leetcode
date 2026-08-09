// Last updated: 9/8/2026, 11:16:35 pm
1class Solution {
2    public boolean carPooling(int[][] trips, int capacity) {
3        int[] d = new int[1001];
4        int st, e, val;
5
6        for (int i = 0; i < trips.length; i++) {
7
8            val = trips[i][0];
9            st = trips[i][1];
10            e = trips[i][2];
11
12            d[st] += val;
13            d[e] -= val;
14
15        }
16
17        int s = 0;
18
19        for (int i = 0; i < d.length; i++) {
20
21            s = s + d[i];
22
23            if (s > capacity) 
24                return false;
25            
26        }
27
28        return true;
29        
30    }
31}