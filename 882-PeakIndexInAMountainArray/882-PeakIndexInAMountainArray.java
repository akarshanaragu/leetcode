// Last updated: 6/4/2026, 10:31:38 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int e = arr.length-1,s=0;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return 0;
    }
}