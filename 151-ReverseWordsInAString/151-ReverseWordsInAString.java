// Last updated: 6/4/2026, 10:34:04 AM
class Solution {
    StringBuilder result = new StringBuilder();
    
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        rec(words, 0);
        return result.toString().trim();
    }

    private void rec(String[] words, int index) {
        if (index == words.length) {
            return;
        }
        rec(words, index + 1);
        result.append(words[index]).append(" ");
    }
}