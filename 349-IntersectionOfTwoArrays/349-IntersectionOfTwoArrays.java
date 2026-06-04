// Last updated: 6/4/2026, 10:32:51 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }
        for(int x : nums2){
            if(set.contains(x)){
                res.add(x);
            }
        }
         
        int[] arr = new int[res.size()];
        
        int j=0;
        for(int i:res){
            arr[j]=i;
            j++;
        }

        return arr;
    }
}