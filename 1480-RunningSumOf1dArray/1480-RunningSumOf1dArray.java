// Last updated: 24/9/2026, 3:08:36 pm
class Solution {
    public void rec(int arr[],int i) {
        if (i == arr.length) {
            return;
        }
        arr[i] += arr[i - 1];
        rec(arr, i + 1);
    }

    public int[] runningSum(int[] nums) {
        if (nums.length > 1) {
            rec(nums, 1);
        }
        return nums;
    }
}