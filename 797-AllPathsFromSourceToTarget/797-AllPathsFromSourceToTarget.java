// Last updated: 24/9/2026, 3:10:31 pm
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