// Last updated: 28/7/2026, 6:13:23 pm
1class Solution {
2    public int count(int num){
3        if(num==0||num<10){
4            return 1;
5        }
6        return 1+count(num/10);
7    }
8
9    public int findNumbers(int[] nums) {
10        int c=0;
11        for (int i = 0; i < nums.length; i++) {
12            int d = count(nums[i]);
13            if(d%2==0){
14                c++;
15            }
16        }
17        return c;
18    }
19}