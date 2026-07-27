// Last updated: 27/7/2026, 12:39:42 pm
1class Solution {
2    public int numRabbits(int[] answers) {
3        HashMap<Integer, Integer> h = new HashMap<>();
4
5        for (int x : answers) {
6            h.put(x, h.getOrDefault(x, 0) + 1);
7        }
8
9        int sum = 0;
10
11        for (int x : h.keySet()) {
12
13            int f = h.get(x);
14            int s = x + 1;
15            int g = (f + s - 1) / s;
16
17            sum += g * s;
18        }
19
20        return sum;
21    }
22}