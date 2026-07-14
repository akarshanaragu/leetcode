// Last updated: 14/7/2026, 4:00:01 pm
1class Solution {
2    public int secondsBetweenTimes(String s, String e) {
3        int h1 = Integer.parseInt(s.substring(0, 2));
4        int min1 = Integer.parseInt(s.substring(3, 5));
5        int sc1 = Integer.parseInt(s.substring(6, 8));
6
7        int h2 = Integer.parseInt(e.substring(0, 2));
8        int min2 = Integer.parseInt(e.substring(3, 5));
9        int sc2 = Integer.parseInt(e.substring(6, 8));
10
11        h1 = h1*60*60; min1 = min1*60; 
12        h2 = h2*60*60; min2 = min2*60;
13
14        return (h2+min2+sc2)-(h1+min1+sc1);
15    }
16}