// Last updated: 6/4/2026, 10:32:10 AM
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int num : nums){

            sum += num;

            count += mp.getOrDefault(sum - k, 0);

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}