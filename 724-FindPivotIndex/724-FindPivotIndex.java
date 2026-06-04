// Last updated: 6/4/2026, 10:31:56 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++)
        total+=nums[i];
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total-nums[i];
            if(total==left)
            return i;

            left=left+nums[i];
        }
        return -1;
    }
}