// Last updated: 6/4/2026, 10:31:43 AM
class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res=new ArrayList<>();
        int n=graph.length;

        dfs_backtracking(0,n-1,graph,new ArrayList<>());
        return res;
    }
    static void dfs_backtracking(int start,int dest,int[][] graph,List<Integer> l){
        l.add(start);
        if(start==dest){
            res.add(new ArrayList<>(l));
            l.remove(l.size()-1);
            return;
        }
        for(int i:graph[start]){
            dfs_backtracking(i,dest,graph,l);
        }
        l.remove(l.size()-1);
    }
}