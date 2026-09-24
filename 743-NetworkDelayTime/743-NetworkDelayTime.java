// Last updated: 24/9/2026, 3:10:58 pm
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dis[] = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        for(int i=1;i<n+1;i++){
            for(int e[]: times){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if(dis[u]!=Integer.MAX_VALUE&&dis[u]+wt<dis[v]){
                    dis[v]=dis[u]+wt;
                }
            }
        }
        int ans=0;
        for(int i=1;i<n+1;i++){
            if(dis[i]==Integer.MAX_VALUE){
                return -1;
            }
            ans= Math.max(ans,dis[i]);
        }
        return ans;
    }
}