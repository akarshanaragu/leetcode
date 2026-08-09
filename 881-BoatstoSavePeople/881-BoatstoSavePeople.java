// Last updated: 9/8/2026, 10:32:20 pm
1class Solution {
2    public int numRescueBoats(int[] p, int limit) {
3
4        Arrays.sort(p);
5        int lt = 0, rt = p.length - 1, c = 0;
6
7        while (lt <= rt) {
8
9            if (p[lt] + p[rt] <= limit) {
10                lt++; rt--; c++;
11            } 
12            
13            else {
14                rt--; c++;
15            }
16
17        }
18
19        return c;
20        
21    }
22
23}