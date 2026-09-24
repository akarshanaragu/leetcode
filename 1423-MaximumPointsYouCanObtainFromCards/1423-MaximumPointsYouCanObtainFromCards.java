// Last updated: 24/9/2026, 3:08:51 pm
class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length;
        int l = 0, sum = 0, min = Integer.MAX_VALUE, Tsum = 0;
        for (int i = 0; i < n; i++) {
            Tsum += c[i];
        }
        if (n == k)
            return Tsum;

        for (int r = 0; r < n; r++) {
            sum += c[r];
            while (r - l + 1 > n - k) {
                sum -= c[l];
                l++;
            }
            if (r - l + 1 == n - k)
                min = Math.min(min, sum);
        }

        return Tsum - min;

    }
}