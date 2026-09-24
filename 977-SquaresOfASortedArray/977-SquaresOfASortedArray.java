// Last updated: 24/9/2026, 3:09:57 pm
class Solution {
    public int[] sortedSquares(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];

        int s = 0;
        int e = len - 1;
        int idx = len - 1;

        while (s <= e) {
            int leftSq = arr[s] * arr[s];
            int rightSq = arr[e] * arr[e];

            if (leftSq > rightSq) {
                ans[idx] = leftSq;
                s++;
            } else {
                ans[idx] = rightSq;
                e--;
            }

            idx--;
        }

        return ans;
    }
}