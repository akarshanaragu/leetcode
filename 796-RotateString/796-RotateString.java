// Last updated: 24/9/2026, 3:10:34 pm
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s + s;
        return str.contains(goal);
    }
}