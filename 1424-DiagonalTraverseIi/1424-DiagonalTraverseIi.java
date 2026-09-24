// Last updated: 24/9/2026, 3:08:50 pm
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int c = 0, max = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int k = i + j;
                max = Math.max(max, k);
                if (!map.containsKey(k)) {
                    map.put(k, new ArrayList<>());
                }
                map.get(k).add(nums.get(i).get(j));
                c++;
            }
        }
        int arr[] = new int[c];
        int k = 0;
        for (int i = 0; i < max + 1; i++) {
            List<Integer> lst = map.get(i);
            for (int j = lst.size() - 1; j >= 0; j--) {
                arr[k++] = lst.get(j);
            }
        }
        return arr;
    }
}