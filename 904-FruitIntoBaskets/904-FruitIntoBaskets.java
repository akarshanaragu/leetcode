// Last updated: 14/7/2026, 11:07:12 pm
1class Solution {
2
3    public int totalFruit(int[] fruits) {
4
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        int left = 0; int ans = 0;
8
9        for (int right = 0; right < fruits.length; right++) {
10
11            map.put(fruits[right],map.getOrDefault(fruits[right], 0) + 1);
12
13            while (map.size() > 2) {
14                map.put(fruits[left],map.get(fruits[left]) - 1);
15
16                if (map.get(fruits[left]) == 0)
17                    map.remove(fruits[left]);
18                left++;
19            }
20
21            ans = Math.max(ans, right - left + 1);
22        }
23
24        return ans;
25    }
26}