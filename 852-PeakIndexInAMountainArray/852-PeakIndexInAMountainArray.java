// Last updated: 24/9/2026, 3:10:23 pm
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
                return m;
            } 
            else if (arr[m] < arr[m + 1]) {
                s = m + 1;
            } 
            else {
                e = m - 1;
            }
        }

        return 0;
    }
}