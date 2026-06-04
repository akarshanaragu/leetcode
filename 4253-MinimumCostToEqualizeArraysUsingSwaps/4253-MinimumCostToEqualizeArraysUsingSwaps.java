// Last updated: 6/4/2026, 10:24:47 AM
class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums2) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }
        int diff = 0;
        for (int v : map.values()) {
            if (v % 2 != 0) {
                return -1;
            }
            diff += Math.abs(v);
        }
        return diff / 4;
    }
}