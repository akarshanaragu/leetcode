// Last updated: 6/4/2026, 10:35:21 AM
class Solution {
    public int trap(int[] h) {
        int water = 0;
        int lmax = 0, rmax = 0;
        int l = 0, r = h.length - 1;
        while (l < r) {
            if (h[l] < h[r]) {
                if (h[l] >= lmax) {
                    lmax = h[l];
                } else {
                    water += lmax - h[l];
                }
                l++;
            } else {
                if (h[r] >= rmax) {
                    rmax = h[r];
                } else {
                    water += rmax - h[r];
                }
                r--;
            }
        }
        return water;
    }
}