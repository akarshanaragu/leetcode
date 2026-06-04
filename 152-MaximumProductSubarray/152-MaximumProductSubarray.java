// Last updated: 6/4/2026, 10:34:06 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max =nums[0],min=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int x = nums[i];
            int tmax=Math.max(x,Math.max(x*max,x*min));
            int tmin=Math.min(x,Math.min(x*min,x*max));
            max=tmax;
            min=tmin;
            ans = Math.max(max,ans);
        }
        return ans;
    }
}