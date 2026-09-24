// Last updated: 24/9/2026, 3:09:54 pm
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