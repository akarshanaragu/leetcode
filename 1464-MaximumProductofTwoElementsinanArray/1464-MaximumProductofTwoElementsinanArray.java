// Last updated: 27/7/2026, 11:43:13 am
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE;
4
5        for(int i : nums){
6            if(i > max1){
7                max2 = max1;
8                max1 = i;
9            }
10            else if(i > max2){
11                max2 = i;
12            }
13        }
14
15        return (max1 - 1) * (max2 - 1);
16    }
17}