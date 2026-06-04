// Last updated: 6/4/2026, 10:31:21 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] indeg = new int[n+1];
        int [] outdeg = new int[n+1];
        if(n==1){
            return 1;
        }
        for(int i=0;i<trust.length;i++){
            outdeg[trust[i][0]]++;
            indeg[trust[i][1]]++;
        }
        for(int i=0;i<n+1;i++){
            if(indeg[i]==n-1&&outdeg[i]==0){
                return i;
            }
        }
        return -1;
    }
}