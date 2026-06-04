// Last updated: 6/4/2026, 10:30:52 AM
//prefix sum


class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int[] left = new int[k + 1];
        int[] right = new int[k + 1];

        left[0] = 0;
        right[0] = 0;

        int i = 1;
        while (i <= k) {
            left[i] = left[i - 1] + cardPoints[i - 1];
            i++;
        }

        i = 1;
        while (i <= k) {
            right[i] = right[i - 1] + cardPoints[n - i];
            i++;
        }

        int max = 0;
        i = 0;
        while (i <= k) {
            max = Math.max(max, left[i] + right[k - i]);
            i++;
        }

        return max;
    }
}
