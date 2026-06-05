// Last updated: 5/6/2026, 9:40:07 pm
1class Solution {
2    public void sortColors(int[] arr) {
3        int left = 0;
4        int curr = 0;
5        int right = arr.length - 1;
6
7        while (curr <= right) {
8            if (arr[curr] == 0) {
9                int swap = arr[left];
10                arr[left] = arr[curr];
11                arr[curr] = swap;
12                left++;
13                curr++;
14            } else if (arr[curr] == 1) {
15                curr++;
16            } else {
17                int swap = arr[curr];
18                arr[curr] = arr[right];
19                arr[right] = swap;
20                right--;
21            }
22        }
23    }
24}