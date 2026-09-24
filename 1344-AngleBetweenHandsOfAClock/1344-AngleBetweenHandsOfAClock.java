// Last updated: 24/9/2026, 3:09:10 pm
class Solution {
    public double angleClock(int hour, int min) {
        double h = ((hour % 12) * 30) + (min * 0.5);
        double m = min * 6;

        double t = Math.abs(h - m);
        return Math.min(t, 360 - (t));
    }
}