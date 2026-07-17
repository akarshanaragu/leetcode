// Last updated: 17/7/2026, 2:23:59 pm
1class Solution {
2    public boolean checkSubarraySum(int[] arr, int k) {
3        int n = arr.length, sum = 0;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        map.put(0, -1);
6        for (int i = 0; i < n; i++) {
7            sum += arr[i];
8            int r = sum % k;
9
10            if (map.containsKey(r)) {
11                if (i - map.get(r) >= 2)
12                    return true;
13
14            } else {
15
16                map.put(r, i);
17            }
18
19        }
20        return false;
21
22    }
23}
24