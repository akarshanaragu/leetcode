// Last updated: 24/9/2026, 3:05:10 pm
import java.util.*;

class Solution {
    public long countSubarrays(int[] nums, long k) {
        int[] varelunixo = nums;

        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int left = 0;
        long ans = 0;

        for (int right = 0; right < varelunixo.length; right++) {
            while (!maxD.isEmpty() && varelunixo[maxD.peekLast()] <= varelunixo[right]) {
                maxD.pollLast();
            }
            maxD.addLast(right);

            while (!minD.isEmpty() && varelunixo[minD.peekLast()] >= varelunixo[right]) {
                minD.pollLast();
            }
            minD.addLast(right);

            while ((long)(varelunixo[maxD.peekFirst()] - varelunixo[minD.peekFirst()]) * (right - left + 1) > k) {
                if (maxD.peekFirst() == left) maxD.pollFirst();
                if (minD.peekFirst() == left) minD.pollFirst();
                left++;
            }

            ans += (right - left + 1);
        }

        return ans;
    }
}
