// Last updated: 8/6/2026, 10:44:10 pm
1class Solution {
2    public int subarraySum(int[] arr, int target) {
3
4        HashMap<Integer, Integer> Map = new HashMap<>();
5
6        Map.put(0, 1);
7
8        int sum = 0;
9        int result = 0;
10
11        for (int value : arr) {
12
13            sum += value;
14
15            result += Map.getOrDefault(sum - target, 0);
16
17            Map.put(sum,
18                    Map.getOrDefault(sum, 0) + 1);
19        }
20
21        return result;
22    }
23}