// Last updated: 6/4/2026, 10:24:53 AM
class Solution {
    public int minimumIndex(int[] capacity, int size) {
        int min = Integer.MAX_VALUE;
        int index  = -1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=size && capacity[i]<min){
                min = capacity[i];
                index=i;
            }
        }
        return index;
    }
}