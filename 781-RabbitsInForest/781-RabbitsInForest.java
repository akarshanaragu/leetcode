// Last updated: 24/9/2026, 3:10:43 pm
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int x : answers) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }

        int sum = 0;

        for (int x : h.keySet()) {

            int f = h.get(x);
            int s = x + 1;
            int g = (f + s - 1) / s;

            sum += g * s;
        }

        return sum;
    }
}