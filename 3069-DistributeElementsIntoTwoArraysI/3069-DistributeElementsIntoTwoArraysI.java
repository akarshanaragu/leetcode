// Last updated: 20/8/2026, 12:03:40 pm
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n = nums.length;
4        int res[] = new int[n];
5        List<Integer> l1 = new ArrayList<>();
6        List<Integer> l2 = new ArrayList<>();
7        l1.add(nums[0]);
8        l2.add(nums[1]);
9        for(int i=2;i<n;i++){
10            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
11                l1.add(nums[i]);
12            }
13            else{
14                l2.add(nums[i]);
15            }
16        }
17
18       int j = 0;
19
20        for (int x : l1) {
21            res[j++] = x;
22        }
23
24        for (int x : l2) {
25            res[j++] = x;
26        }
27        return res;
28    }
29}