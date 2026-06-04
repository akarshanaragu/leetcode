// Last updated: 6/4/2026, 10:25:07 AM
import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int[] temarivolo = nums;

        List<Long> result = new ArrayList<>();

        for (int num : temarivolo) {
            result.add((long) num);

            while (result.size() >= 2) {
                int n = result.size();
                if (result.get(n - 1).equals(result.get(n - 2))) {
                    long sum = result.get(n - 1) + result.get(n - 2);
                    result.remove(n - 1);
                    result.remove(n - 2);
                    result.add(sum);
                } else {
                    break;
                }
            }
        }

        return result;
    }
}
