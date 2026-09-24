// Last updated: 24/9/2026, 3:10:26 pm
class Solution {
    static boolean[] v;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        v = new boolean[rooms.size()];
        for (int i = 0; i < rooms.size(); i++)
            v[i] = false;

        dfs(0, rooms);
        for (boolean i : v) {
            if (!i)
                return false;
        }

        return true;
    }

    static void dfs(int start, List<List<Integer>> rooms) {
        v[start] = true;
        for (int i : rooms.get(start)) {
            if (v[i] == false)
                dfs(i, rooms);
        }
    }

}