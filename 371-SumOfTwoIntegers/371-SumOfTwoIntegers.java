// Last updated: 6/4/2026, 10:32:48 AM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
        return a;
    }
}