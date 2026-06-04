// Last updated: 6/4/2026, 10:31:02 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length() %2==0) count++;
        }
        return count;
    }
}