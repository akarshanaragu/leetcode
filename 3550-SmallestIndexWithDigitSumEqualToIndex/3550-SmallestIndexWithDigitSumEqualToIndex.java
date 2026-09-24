// Last updated: 24/9/2026, 3:05:48 pm
class Solution {
    public int sum(int num){
        int s =0;
        while(num>0){
            int t = num%10;
            s+=t;
            num=num/10;
        }
        return s;
    }

    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }

}