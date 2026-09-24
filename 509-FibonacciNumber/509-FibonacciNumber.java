// Last updated: 24/9/2026, 3:09:59 pm
class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 2) + fib(n - 1);
    }
}