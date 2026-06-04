// Last updated: 6/4/2026, 10:25:06 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        int[] suffixSum = new int[n];
        suffixSum[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        int count = 0;

        
        for (int i = 0; i < n - 1; i++) {
            int rightSum = suffixSum[i + 1];
            int rightCount = n - i - 1;

            if (nums[i] * rightCount > rightSum) {
                count++;
            }
        }

        return count;
    }
}
