// Last updated: 20/7/2026, 9:22:22 am
class Solution {
    public boolean consecutiveSetBits(int n) {
        return Integer.bitCount(n& (n>>1))==1;
    }
}