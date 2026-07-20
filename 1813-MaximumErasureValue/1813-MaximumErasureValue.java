// Last updated: 20/7/2026, 9:23:31 am
class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int l = 0, n = arr.length, sum = 0, max = 0;
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            while (h.contains(a)) {
                h.remove(arr[l]);
                sum = sum - arr[l];
                l++;
            }
            sum += a;
            h.add(a);
            max = Math.max(sum, max);
        }
        return max;

    }
}