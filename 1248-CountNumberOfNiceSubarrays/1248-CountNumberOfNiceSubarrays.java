// Last updated: 24/9/2026, 3:09:22 pm
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }

    public int atmost(int[] arr, int k) {
        int l = 0, res = 0, odd = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] % 2 != 0) {
                odd++;
            }
            while (odd > k) {
                if (arr[l] % 2 != 0) {
                    odd--;
                }
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
