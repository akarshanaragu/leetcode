// Last updated: 8/6/2026, 11:24:15 pm
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int x : nums){
5            set.add(x);
6        }
7        int max=0;
8        for(int x : set){
9            if(!set.contains(x-1)){
10                int count =1;
11                int n = x;
12                while(set.contains(n+1)){
13                    count++;
14                    n++;
15                }
16                max = Math.max(count,max);
17            }
18        }
19        
20        return max;
21    }
22}