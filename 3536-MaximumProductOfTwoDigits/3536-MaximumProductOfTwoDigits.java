// Last updated: 24/9/2026, 3:05:51 pm
class Solution {
    public int maxProduct(int n) {
        int m1 = -1 , m2 = -1;
        while(n != 0){
            int t = n % 10;
            if(m1 <= t){
                m2 = m1;
                m1 = t;
            }
            else if(m2 < t){
                m2 = t;
            }
            n /= 10;
        }
        return m1 * m2;
    }
}