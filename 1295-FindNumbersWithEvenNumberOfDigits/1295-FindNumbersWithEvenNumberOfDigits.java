// Last updated: 24/9/2026, 3:09:21 pm
class Solution {
    public int count(int num){
        if(num==0||num<10){
            return 1;
        }
        return 1+count(num/10);
    }

    public int findNumbers(int[] nums) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            int d = count(nums[i]);
            if(d%2==0){
                c++;
            }
        }
        return c;
    }
}