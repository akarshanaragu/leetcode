// Last updated: 24/9/2026, 3:07:31 pm
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