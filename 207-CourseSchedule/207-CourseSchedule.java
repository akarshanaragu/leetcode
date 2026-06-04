// Last updated: 6/4/2026, 10:33:31 AM
class Solution {
    HashMap<Integer,List<Integer>> map;
    public boolean canFinish(int n, int[][] edges) {
        map=new HashMap<>();
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            map.putIfAbsent(u,new ArrayList<>());
            map.get(u).add(v);
        }
         
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!dfs(i,vis)) return false;
        }
        return true;
    }

    boolean dfs(int s,boolean[] vis){
        if(vis[s]){
            return false;
        }
        if(!map.containsKey(s) || map.get(s).size()==0) return true;
        vis[s]=true;

        for(int i:map.get(s)){
            if(!dfs(i,vis)) return false;
        }
        vis[s]=false;
        map.put(s,new ArrayList<>());
        return true;
    }
}