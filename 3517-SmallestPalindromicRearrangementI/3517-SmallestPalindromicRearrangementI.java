// Last updated: 24/9/2026, 3:05:58 pm
class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder st = new StringBuilder();
        char mid = 0;
        
        for (char ch : map.keySet()) {
            for (int i = 0; i < map.get(ch) / 2; i++) {
                st.append(ch);
            }

            if (map.get(ch) % 2 == 1) {
                mid = ch;
            }
        }

        char[] arr = st.toString().toCharArray();
        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        for (char ch : arr) {
            res.append(ch);
        }

        if (mid != 0) {
            return res.toString() + mid + res.reverse().toString();
        }
        return res.toString() + res.reverse().toString();

    }
}