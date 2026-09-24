// Last updated: 24/9/2026, 3:05:18 pm
class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int min = nums[0], max = nums[0];

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}