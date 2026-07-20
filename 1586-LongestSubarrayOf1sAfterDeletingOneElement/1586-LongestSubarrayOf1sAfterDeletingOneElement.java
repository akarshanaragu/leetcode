// Last updated: 20/7/2026, 9:23:40 am
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int z = 0, max = 0, l = 0, len = 0;
        for (int r = 0; r < n; r++) {
            if (nums[r] == 0) {
                z++;
            }
            while (z > 1) {
                if (nums[l] == 0)
                    z--;
                l++;
            }
            len = r - l;
            max = Math.max(len, max);
        }
        return max;
    }
}