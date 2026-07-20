// Last updated: 20/7/2026, 9:22:54 am
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long ans = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                sum -= nums[left];
                if (map.get(nums[left]) > 1) {
                    int x = map.get(nums[left]);
                    map.put(nums[left], x - 1);
                } else {
                    map.remove(nums[left]);
                }
                left++;
            }


            if (right - left + 1 == k && map.size() == k) {
                ans = Math.max(ans, sum);
            }

        }

        return ans;
    }
}