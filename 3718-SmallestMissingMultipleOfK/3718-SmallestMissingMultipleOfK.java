// Last updated: 24/9/2026, 3:05:22 pm
class Solution {

    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> h = new HashSet<>();
        for(int x : nums){
            h.add(x);
        }

        for (int i = k; ; i += k) {
            if (!h.contains(i)) {
                return i;
            }
        }
    }
    
}