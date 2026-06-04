// Last updated: 6/4/2026, 10:31:28 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int currMax = 0, maxSum = nums[0];
        int currMin = 0, minSum = nums[0];

        for (int x : nums) {
            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(x, currMin + x);
            minSum = Math.min(minSum, currMin);

            total += x;
        }

        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, total - minSum);
    }
}
