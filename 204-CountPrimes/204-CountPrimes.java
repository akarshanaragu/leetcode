// Last updated: 10/8/2026, 6:21:36 pm
1public class Solution {
2    public int countPrimes(int n) {
3        boolean[] notprime = new boolean[n];
4        int count = 0;
5        for (int i = 2; i < n; i++) {
6            if (notprime[i] == false) {
7                count++;
8                for (int j = 2; i*j < n; j++) {
9                    notprime[i*j] = true;
10                }
11            }
12        }
13        
14        return count;
15    }
16}