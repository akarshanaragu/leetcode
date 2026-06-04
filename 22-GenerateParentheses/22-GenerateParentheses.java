// Last updated: 6/4/2026, 10:35:38 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, "", 0, 0, n);
        return ans;
    }

    public void solve(List<String> ans, String str, int left, int right, int n) {
        if (str.length() == n * 2) {
            ans.add(str);
            return;
        }

        if (left < n) {
            solve(ans, str + "(", left + 1, right, n);
        }

        if (right < left) {
            solve(ans, str + ")", left, right + 1, n);
        }
    }
}