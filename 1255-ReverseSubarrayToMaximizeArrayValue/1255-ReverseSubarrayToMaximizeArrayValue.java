// Last updated: 6/4/2026, 10:31:06 AM
class Solution {
    public int maxValueAfterReverse(int[] nums) {
        int n = nums.length;
        int base = 0;

        for(int i = 0; i < n - 1; i++){
            base += Math.abs(nums[i] - nums[i+1]);
        }

        int gain = 0;

        // Prefix and Suffix cases
        for(int i = 0; i < n - 1; i++){
            gain = Math.max(gain,
                    Math.abs(nums[0] - nums[i+1]) - Math.abs(nums[i] - nums[i+1]));

            gain = Math.max(gain,
                    Math.abs(nums[n-1] - nums[i]) - Math.abs(nums[i] - nums[i+1]));
        }

        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;

        for(int i = 0; i < n - 1; i++){
            high = Math.max(high, Math.min(nums[i], nums[i+1]));
            low = Math.min(low, Math.max(nums[i], nums[i+1]));
        }

        gain = Math.max(gain, 2 * (high - low));

        return base + gain;
    }
}