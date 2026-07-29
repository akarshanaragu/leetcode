// Last updated: 29/7/2026, 5:33:52 pm
1class Solution {
2
3    public List<List<Integer>> permuteUnique(int[] nums) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6        Arrays.sort(nums); 
7        boolean[] used = new boolean[nums.length];
8        backtrack(nums, used, new ArrayList<>(), ans);
9
10        return ans;
11    }
12
13
14    public void backtrack(int[] nums, boolean[] used,List<Integer> path,List<List<Integer>> ans) {
15
16        if (path.size() == nums.length) {
17            ans.add(new ArrayList<>(path));
18            return;
19        }
20
21        for (int i = 0; i < nums.length; i++) {
22
23            if (used[i]) {
24                continue;
25            }
26
27            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
28                continue;
29            }
30
31            used[i] = true;
32            path.add(nums[i]);
33            backtrack(nums, used, path, ans);
34
35            path.remove(path.size()-1);
36            used[i] = false;
37        }
38    }
39}