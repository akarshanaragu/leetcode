// Last updated: 24/9/2026, 3:15:06 pm
class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); 
        
        generate(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);
            generate(nums, i + 1, current, ans);
            current.remove(current.size() - 1);
        }

    }

}