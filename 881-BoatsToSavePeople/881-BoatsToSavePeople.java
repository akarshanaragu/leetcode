// Last updated: 24/9/2026, 3:10:17 pm
class Solution {
    public int numRescueBoats(int[] p, int limit) {

        Arrays.sort(p);
        int lt = 0, rt = p.length - 1, c = 0;

        while (lt <= rt) {

            if (p[lt] + p[rt] <= limit) {
                lt++; rt--; c++;
            } 
            
            else {
                rt--; c++;
            }

        }

        return c;
        
    }

}