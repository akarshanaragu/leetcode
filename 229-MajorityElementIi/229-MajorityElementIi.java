// Last updated: 24/9/2026, 3:13:11 pm
class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> li = new ArrayList<>();
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int x : map.keySet()) {
            if (map.get(x) > n / 3) {
                li.add(x);
            }
        }
        return li;
    }
}