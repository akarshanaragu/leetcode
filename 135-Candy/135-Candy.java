// Last updated: 6/4/2026, 10:34:17 AM
class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int count = 0;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (r[i] > r[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (r[i] < r[i - 1]) {
                c[i - 1] = Math.max(c[i] + 1, c[i - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            count += c[i];
        }
        return count;

    }
}