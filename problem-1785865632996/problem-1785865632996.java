// Last updated: 4/8/2026, 11:17:12 pm
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3
4        List<Integer> result = new ArrayList<>();
5        Set<Integer> set = new HashSet<>();
6
7        int min = nums[0], max = nums[0];
8
9        for (int num : nums) {
10            set.add(num);
11            min = Math.min(min, num);
12            max = Math.max(max, num);
13        }
14
15        for (int i = min; i <= max; i++) {
16            if (!set.contains(i)) {
17                result.add(i);
18            }
19        }
20
21        return result;
22    }
23}