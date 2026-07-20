// Last updated: 20/7/2026, 9:23:03 am
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String str : patterns) {
            if (word.indexOf(str) != -1)
                ans++;
        }
        return ans;
    }
}