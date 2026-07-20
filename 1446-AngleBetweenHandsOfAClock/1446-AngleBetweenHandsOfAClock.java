// Last updated: 20/7/2026, 9:23:47 am
class Solution {
    public double angleClock(int hour, int min) {
        double h = ((hour % 12) * 30) + (min * 0.5);
        double m = min * 6;

        double t = Math.abs(h - m);
        return Math.min(t, 360 - (t));
    }
}