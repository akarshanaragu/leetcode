// Last updated: 20/7/2026, 9:23:05 am
class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int arr[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }
}