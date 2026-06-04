// Last updated: 6/4/2026, 10:30:16 AM
class Solution {
public:
int n;
    int f(int i, int xorsum, vector<int>& nums){
        if (i==n) return xorsum;
        int x=nums[i];
        int take=f(i+1, xorsum^x, nums);
        int notake=f(i+1, xorsum, nums);
        return take+notake;
    }
    int subsetXORSum(vector<int>& nums) {
        n=nums.size();
        return f(0, 0, nums);
    }
};