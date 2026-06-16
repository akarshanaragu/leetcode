// Last updated: 16/6/2026, 10:04:48 am
1class Solution {
2    public List<Integer> majorityElement(int[] arr) {
3        List<Integer> li = new ArrayList<>();
4        int n = arr.length;
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int i = 0; i < n; i++) {
7            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
8        }
9        for (int x : map.keySet()) {
10            if (map.get(x) > n / 3) {
11                li.add(x);
12            }
13        }
14        return li;
15    }
16}