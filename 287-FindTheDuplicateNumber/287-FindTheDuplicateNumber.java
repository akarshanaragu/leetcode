// Last updated: 6/4/2026, 10:33:03 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int s = 1, e = n - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            int count = 0;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }
            if (count > mid)
                e = mid;
            else
                s = mid + 1;
        }
        return s;
    }
}