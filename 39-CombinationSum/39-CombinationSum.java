// Last updated: 6/4/2026, 10:35:25 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] nums, int target, int index,
                      List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == nums.length || target < 0) {
            return;
        }

        list.add(nums[index]);
        solve(nums, target - nums[index], index, list, ans);
        list.remove(list.size() - 1);

        solve(nums, target, index + 1, list, ans);
    }
}