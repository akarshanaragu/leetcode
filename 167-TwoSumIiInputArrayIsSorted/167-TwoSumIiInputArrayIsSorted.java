// Last updated: 6/4/2026, 10:33:54 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            if(nums[l]+nums[r]==target){
                return new int[] {l+1,r+1};
            }
            else if(nums[l]+nums[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[] {};
    }
}