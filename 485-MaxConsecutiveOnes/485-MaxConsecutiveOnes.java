// Last updated: 6/4/2026, 10:32:26 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int l = 0, max = 0;
        int c = 0;
        for (int r = 0; r < n; r++) {
            if (nums[r] == 1) {
                c++;
                max = Math.max(max, c);
            } else {
                c = 0;
            }
        }
        return max;
    }
}