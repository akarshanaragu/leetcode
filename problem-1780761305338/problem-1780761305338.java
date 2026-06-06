// Last updated: 6/6/2026, 9:25:05 pm
1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        return Integer.bitCount(n& (n>>1))==1;
4    }
5}