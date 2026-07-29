// Last updated: 29/7/2026, 10:48:14 pm
1class Solution {
2
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6        Arrays.sort(nums); 
7        
8        generate(nums, 0, new ArrayList<>(), ans);
9
10        return ans;
11    }
12
13    public void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> ans) {
14
15        ans.add(new ArrayList<>(current));
16
17        for (int i = index; i < nums.length; i++) {
18
19            if (i > index && nums[i] == nums[i - 1]) {
20                continue;
21            }
22
23            current.add(nums[i]);
24            generate(nums, i + 1, current, ans);
25            current.remove(current.size() - 1);
26        }
27
28    }
29
30}