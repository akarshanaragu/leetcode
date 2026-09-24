// Last updated: 24/9/2026, 3:10:14 pm
class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int l=0,mid=0,h=nums.length-1;
       while(mid<nums.length){
        if(nums[mid]%2==0){
            int temp=nums[mid];
            nums[mid]=nums[l];
            nums[l]=temp;
            l++;
        }
        mid++;
       }
        
       return nums;
    }
}