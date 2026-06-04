// Last updated: 6/4/2026, 10:30:33 AM
class Solution {
    public int concatenatedBinary(int n) {
        int MOD = 1_000_000_007;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
        int res = 0;
        for(int i=0;i<sb.length();i++){
            res = ((res << 1) + (sb.charAt(i)-'0'))%MOD;
        }
        return res;
    }
}