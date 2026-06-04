// Last updated: 6/4/2026, 10:35:12 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i]+curr,nums[i]);
            max = Math.max(curr,max);
        }
        return max;
    }
}