// Last updated: 6/4/2026, 10:31:01 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0, count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold)
            count++;
        for (int i = 1; i < n - k + 1; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (sum / k >= threshold)
                count++;
        }
        return count;
    }
}