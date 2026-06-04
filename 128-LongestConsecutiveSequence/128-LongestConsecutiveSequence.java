// Last updated: 6/4/2026, 10:34:21 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int max=0;
        for(int x : set){
            if(!set.contains(x-1)){
                int count =1;
                int n = x;
                while(set.contains(n+1)){
                    count++;
                    n++;
                }
                max = Math.max(count,max);
            }
        }
        
        return max;
    }
}