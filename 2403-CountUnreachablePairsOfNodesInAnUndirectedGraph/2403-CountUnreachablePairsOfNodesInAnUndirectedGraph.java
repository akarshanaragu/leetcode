// Last updated: 6/4/2026, 10:25:52 AM
class Solution {
    HashMap<Integer,List<Integer>> h;
    boolean[] visited;

    int dfs(int i){
        visited[i]=true;
        int c=1;
        for(int x:h.get(i)){
            if(visited[x]==false){
              
                c+=dfs(x);
            }
        }
        return c;

    }
    public long countPairs(int n, int[][] edges) {
       
        h=new HashMap<>();
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            h.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            h.get(u).add(v);
            h.get(v).add(u);
        }
        ArrayList<Integer> lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){        
                lis.add(dfs(i));
            }
        }
        long count=0;
        for(int i:lis){
            n=n-i;
            count+=(long)n*i;
            
        }
        return count;
    }
}