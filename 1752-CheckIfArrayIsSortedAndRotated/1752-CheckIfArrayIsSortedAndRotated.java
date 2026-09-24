// Last updated: 24/9/2026, 3:07:59 pm
class Solution {
    public boolean check(int[] a) {

        int n = a.length;
        int c = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] > a[(i + 1) % n]) {
                c++;
            }

        }

        return c <= 1;
    }
}