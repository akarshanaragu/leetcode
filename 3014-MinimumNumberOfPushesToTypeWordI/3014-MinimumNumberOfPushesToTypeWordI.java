// Last updated: 24/9/2026, 3:06:31 pm
class Solution {
    public int minimumPushes(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int min = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Integer> l = new ArrayList<>();
        for (int x : map.values()) {
            l.add(x);
        }
        Collections.sort(l, Collections.reverseOrder());
        
        for (int i = 0; i < l.size(); i++) {
            min += l.get(i) * (i / 8 + 1);
        }

        return min;

    }
}