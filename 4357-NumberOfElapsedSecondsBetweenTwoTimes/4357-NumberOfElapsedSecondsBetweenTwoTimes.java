// Last updated: 20/7/2026, 9:22:23 am
class Solution {
    public int secondsBetweenTimes(String s, String e) {
        int h1 = Integer.parseInt(s.substring(0, 2));
        int min1 = Integer.parseInt(s.substring(3, 5));
        int sc1 = Integer.parseInt(s.substring(6, 8));

        int h2 = Integer.parseInt(e.substring(0, 2));
        int min2 = Integer.parseInt(e.substring(3, 5));
        int sc2 = Integer.parseInt(e.substring(6, 8));

        h1 = h1*60*60; min1 = min1*60; 
        h2 = h2*60*60; min2 = min2*60;

        return (h2+min2+sc2)-(h1+min1+sc1);
    }
}