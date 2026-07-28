// Last updated: 28/7/2026, 11:04:06 pm
1class Solution {
2
3    public List<List<Integer>> permute(int[] nums) {
4        
5        List<List<Integer>> result = new ArrayList<>();
6
7        boolean[] used = new boolean[nums.length];
8        backtrack(nums, used, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    public void backtrack( int[] nums, boolean[] used,List<Integer> current,List<List<Integer>> result) {
14
15        if (current.size() == nums.length) {
16            result.add(new ArrayList<>(current));
17            return;
18        }
19
20        for (int i = 0; i < nums.length; i++) {
21
22            if (used[i]) {
23                continue;
24            }
25
26            used[i] = true;
27            current.add(nums[i]);
28
29            backtrack(nums, used, current, result);
30
31            current.remove(current.size() - 1);
32            used[i] = false;
33        }
34    }
35    
36}
37
38