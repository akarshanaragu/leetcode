// Last updated: 24/9/2026, 3:15:28 pm
class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        int res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long a = (long) mid * mid;
            if (a == x) {
                return mid;
            } else if (a < x) {
                res = mid;
                l = mid + 1;
            } else {

                r = mid - 1;
            }
        }
        return res;
    }
}