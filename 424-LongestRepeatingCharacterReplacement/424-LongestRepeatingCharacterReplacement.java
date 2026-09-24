// Last updated: 24/9/2026, 3:12:09 pm
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, max = 0, f = 0;
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            f = Math.max(f, map.get(s.charAt(r)));
            if ((r - l + 1) - f > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                if (map.get(s.charAt(l)) == 0)
                    map.remove(s.charAt(l));
                l++;
            }
            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}