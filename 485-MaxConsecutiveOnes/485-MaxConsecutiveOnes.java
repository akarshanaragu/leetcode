// Last updated: 4/6/2026, 10:38:39 pm
1class Solution {
2    public int findMaxConsecutiveOnes(int[] arr) {
3
4        int len = arr.length;
5        int ans = 0;
6        int cnt = 0;
7
8        for (int i = 0; i < len; i++) {
9
10            if (arr[i] == 1) {
11                cnt++;
12                ans = Math.max(ans, cnt);
13            } else {
14                cnt = 0;
15            }
16
17        }
18
19        return ans;
20    }
21}