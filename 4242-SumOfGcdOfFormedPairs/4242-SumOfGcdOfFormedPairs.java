// Last updated: 6/4/2026, 10:24:54 AM
class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = Math.max(x, nums[i]);
            prefix[i] = gcd(nums[i], x);
        }
        Arrays.sort(prefix);
        long sum = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            sum += gcd(prefix[l], prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
}