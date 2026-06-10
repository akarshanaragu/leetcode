// Last updated: 10/6/2026, 10:36:33 pm
1class Solution {
2    public int[] searchRange(int[] arr, int key) {
3
4        int[] ans = {-1, -1};
5
6        int first = findPos(arr, key, true);
7        int last = findPos(arr, key, false);
8
9        ans[0] = first;
10        ans[1] = last;
11
12        return ans;
13    }
14
15    private int findPos(int[] arr, int key, boolean findFirst) {
16        
17        int s = 0;
18        int e = arr.length - 1;
19        int pos = -1;
20
21        while (s <= e) {
22            int m = s + (e - s) / 2;
23
24            if (arr[m] > key) {
25                e = m - 1;
26            } else if (arr[m] < key) {
27                s = m + 1;
28            } else {
29                pos = m;
30
31                if (findFirst) {
32                    e = m - 1;
33                } else {
34                    s = m + 1;
35                }
36            }
37        }
38
39        return pos;
40    }
41}