// Last updated: 9/7/2026, 11:08:23 am
1class Solution {
2    public int maximumUniqueSubarray(int[] arr) {
3        int l = 0, n = arr.length, sum = 0, max = 0;
4        HashSet<Integer> h = new HashSet<>();
5        for (int i = 0; i < n; i++) {
6            int a = arr[i];
7            while (h.contains(a)) {
8                h.remove(arr[l]);
9                sum = sum - arr[l];
10                l++;
11            }
12            sum += a;
13            h.add(a);
14            max = Math.max(sum, max);
15        }
16        return max;
17
18    }
19}