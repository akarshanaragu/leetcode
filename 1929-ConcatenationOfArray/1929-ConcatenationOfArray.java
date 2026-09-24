// Last updated: 24/9/2026, 3:07:12 pm
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