// Last updated: 10/6/2026, 11:52:16 pm
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int s = 0;
4        int e = arr.length - 1;
5
6        while (s <= e) {
7            int m = (s + e) / 2;
8
9            if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
10                return m;
11            } 
12            else if (arr[m] < arr[m + 1]) {
13                s = m + 1;
14            } 
15            else {
16                e = m - 1;
17            }
18        }
19
20        return 0;
21    }
22}