// Last updated: 20/7/2026, 9:23:56 am
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
        int res = 0, sum = 0, n = grumpy.length, l = 0, max = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                res += customers[i];
            }
        }
        for (int r = 0; r < n; r++) {
            if (grumpy[r] == 1)
                sum += customers[r];
            if (r - l + 1 > min) {
                if (grumpy[l] == 1) {
                    sum -= customers[l];
                }
                l++;

            }
            max = Math.max(sum, max);
        }
        res += max;

        return res;
    }
}