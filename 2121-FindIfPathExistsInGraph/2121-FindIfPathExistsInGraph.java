// Last updated: 6/4/2026, 10:25:58 AM
class Solution {
    HashMap<Integer,List<Integer>> h;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       h=new HashMap<>();
       for(int i=0;i<edges.length;i++)
       {
        int u=edges[i][0];
        int v=edges[i][1];
        h.putIfAbsent(u,new ArrayList<>());
        h.putIfAbsent(v,new ArrayList<>());
        h.get(u).add(v);
        h.get(v).add(u);
       } 
    boolean[] visited=new boolean[n];
    for(int i=0;i<n;i++){
        visited[i]=false;
    }
    return dfs(source,destination,visited);
    }
    public boolean dfs(int source,int destination,boolean[] vis){
        vis[source]=true;
        if(source == destination) return true;
        for(int i:h.get(source)){
            if(vis[i]==false){
                if(dfs(i,destination,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}