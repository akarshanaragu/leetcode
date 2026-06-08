// Last updated: 8/6/2026, 11:48:42 pm
1class Solution {
2    public int majorityElement(int[] arr) {
3
4        int ans = 0;
5        int cnt = 0;
6
7        for (int num : arr) {
8
9            if (cnt == 0) {
10                ans = num;
11            }
12
13            if (num == ans) {
14                cnt++;
15            } else {
16                cnt--;
17            }
18        }
19
20        return ans;
21    }
22}