// Last updated: 6/4/2026, 10:32:38 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

   
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, windowCount)) {
            ans.add(0);
        }

        for (int i = k; i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;

            windowCount[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(pCount, windowCount)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}