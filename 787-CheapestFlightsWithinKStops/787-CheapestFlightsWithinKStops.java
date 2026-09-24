// Last updated: 24/9/2026, 3:10:42 pm
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        int[] dis= new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src] = 0;
        for(int i=0;i<=k;i++){
            int[] temp = Arrays.copyOf(dis,n);
            for(int e[]: flights){
                int u = e[0];
                int v = e[1];
                int wt = e[2];
                if(dis[u]!=Integer.MAX_VALUE&&dis[u]+wt<temp[v]){
                    temp[v] = dis[u]+wt;
                }
            }
            dis=temp;
        }
        return dis[dest]==Integer.MAX_VALUE?-1:dis[dest];
    }
}