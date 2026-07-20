// Last updated: 20/7/2026, 9:24:14 am
class Solution {
    public int numSubarrayBoundedMax(int[] arr, int left, int right) {
        return ans(arr, right) - ans(arr, left - 1);
    }

    public int ans(int arr[], int k) {
        int l = 0, res = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] > k) {
                l = r + 1;
            }
            res += r - l + 1;
        }
        return res;
    }
}