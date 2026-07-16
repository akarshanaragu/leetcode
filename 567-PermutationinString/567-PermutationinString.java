// Last updated: 16/7/2026, 6:20:38 pm
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length()) {
4            return false;
5        }
6        HashMap<Character, Integer> sc1 = new HashMap<>();
7        HashMap<Character, Integer> sc2 = new HashMap<>();
8
9        for (int i = 0; i < s1.length(); i++) {
10            sc1.put(s1.charAt(i), sc1.getOrDefault(s1.charAt(i), 0) + 1);
11            sc2.put(s2.charAt(i), sc2.getOrDefault(s2.charAt(i), 0) + 1);
12        }
13        if (sc1.equals(sc2))
14            return true;
15
16        int l = 0;
17        for (int r = s1.length(); r < s2.length(); r++) {
18
19            sc2.put(s2.charAt(r), sc2.getOrDefault(s2.charAt(r), 0) + 1);
20
21            sc2.put(s2.charAt(l), sc2.get(s2.charAt(l)) - 1);
22
23            if (sc2.get(s2.charAt(l)) == 0) {
24                sc2.remove(s2.charAt(l));
25            }
26            l++;
27
28            if (sc1.equals(sc2))
29                return true;
30        }
31        return false;
32    }
33}