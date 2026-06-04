// Last updated: 6/4/2026, 10:32:13 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(i!=j&&isConnected[i][j]==1){
                    map.get(i).add(j);
                }
            }
        }
        boolean[] vis = new boolean[isConnected.length];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
            dfs(i,map,vis);
            ans++;}
        }
    
        return ans;
    }

    public void dfs(int  a,HashMap<Integer,List<Integer>> map,boolean vis[]){
        vis[a] = true;
        for(int i:map.get(a)){
            if(vis[i]==false){
                dfs(i,map,vis);
            }
        }
    }
}