// Last updated: 25/7/2026, 6:05:47 pm
1class Solution {
2    public int maxProduct(int n) {
3        int m1 = -1 , m2 = -1;
4        while(n != 0){
5            int t = n % 10;
6            if(m1 <= t){
7                m2 = m1;
8                m1 = t;
9            }
10            else if(m2 < t){
11                m2 = t;
12            }
13            n /= 10;
14        }
15        return m1 * m2;
16    }
17}