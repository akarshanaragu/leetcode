// Last updated: 6/4/2026, 10:31:58 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1){
            return 0;
        }
        int p=1,c=0,r=0;
        for(int l=0;l<n;l++){
            p*=nums[l];
            while(p>=k&&r<n){
                p/=nums[r++];
            }
            c+=l-r+1;
        }
        return c;
    }
}