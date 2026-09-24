// Last updated: 24/9/2026, 3:11:24 pm
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> sc1 = new HashMap<>();
        HashMap<Character, Integer> sc2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            sc1.put(s1.charAt(i), sc1.getOrDefault(s1.charAt(i), 0) + 1);
            sc2.put(s2.charAt(i), sc2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (sc1.equals(sc2))
            return true;

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {

            sc2.put(s2.charAt(r), sc2.getOrDefault(s2.charAt(r), 0) + 1);

            sc2.put(s2.charAt(l), sc2.get(s2.charAt(l)) - 1);

            if (sc2.get(s2.charAt(l)) == 0) {
                sc2.remove(s2.charAt(l));
            }
            l++;

            if (sc1.equals(sc2))
                return true;
        }
        return false;
    }
}