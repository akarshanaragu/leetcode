// Last updated: 18/6/2026, 11:36:18 am
1class Solution {
2    public double angleClock(int hour, int min) {
3        double h = ((hour % 12) * 30) + (min * 0.5);
4        double m = min * 6;
5
6        double t = Math.abs(h - m);
7        return Math.min(t, 360 - (t));
8    }
9}