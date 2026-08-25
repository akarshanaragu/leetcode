// Last updated: 25/8/2026, 10:29:32 am
1class Solution {
2
3    public int missingMultiple(int[] nums, int k) {
4        
5        HashSet<Integer> h = new HashSet<>();
6        for(int x : nums){
7            h.add(x);
8        }
9
10        for (int i = k; ; i += k) {
11            if (!h.contains(i)) {
12                return i;
13            }
14        }
15    }
16    
17}