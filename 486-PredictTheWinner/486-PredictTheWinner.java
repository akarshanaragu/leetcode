// Last updated: 24/9/2026, 3:11:45 pm
class Solution {

    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }

    public int solve(int[] nums, int left, int right) {

        if (left == right)
            return nums[left];

        int l = nums[left] - solve(nums, left + 1, right);
        int r = nums[right] - solve(nums, left, right - 1);

        return Math.max(l, r);
    }

}