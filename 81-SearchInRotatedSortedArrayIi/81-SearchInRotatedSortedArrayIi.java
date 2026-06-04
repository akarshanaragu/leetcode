// Last updated: 6/4/2026, 10:34:53 AM
class Solution {
    public boolean search(int[] arr, int tar) {
        int len = arr.length;
        int s = 0, e = len - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == tar) {
                return true;
            }

            if (arr[s] == arr[m] && arr[m] == arr[e]) {
                s++;
                e--;
                continue;
            }

            if (arr[s] <= arr[m]) {
                if (arr[s] <= tar && tar < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (arr[m] < tar && tar <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return false;
    }
}