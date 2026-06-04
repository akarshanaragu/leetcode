// Last updated: 6/4/2026, 10:24:49 AM
class Solution {
    public boolean repeat(int n,int arr[],int a){
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]&&i!=a){
                return false;
            }
        }
        return true;
    }
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && repeat(nums[i],nums,i)){
                return nums[i];
            }
        }
        return -1;
    }
}