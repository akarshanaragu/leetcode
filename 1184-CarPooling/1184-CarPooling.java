// Last updated: 6/4/2026, 10:31:11 AM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        int start,end,val;
        for(int i=0;i<trips.length;i++){
            val = trips[i][0];
            start = trips[i][1];
            end = trips[i][2];
            diff[start]+=val;
            
                diff[end]-=val;
            
        }
        int sum=0;
        for(int i=0;i<diff.length;i++){
            sum=sum+diff[i];
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}