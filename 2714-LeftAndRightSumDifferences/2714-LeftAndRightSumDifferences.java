// Last updated: 20/7/2026, 9:22:52 am
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            total -= nums[i]; 
            ans[i] = Math.abs(leftSum - total);
            leftSum += nums[i];
        }
        return ans;
    }
}