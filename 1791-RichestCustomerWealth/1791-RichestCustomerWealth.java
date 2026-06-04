// Last updated: 6/4/2026, 10:30:35 AM
class Solution {
    public int maximumWealth(int[][] arr) {
        int max=0;
        for(int i[]:arr){
            int sum =0;
            for(int j : i){
                sum+=j;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}