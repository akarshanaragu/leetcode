// Last updated: 6/4/2026, 10:26:13 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int res=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            res = res|nums[i];
        }
        return res<<(n-1);
    }
}