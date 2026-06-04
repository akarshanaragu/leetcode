// Last updated: 6/4/2026, 10:34:55 AM
class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int l=0,mid=0,h=n-1;
        while(mid<=h){
            if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[h];
                arr[h]=temp;
                h--;
            }
            else if(arr[mid]==0){
                int t=arr[mid];
                arr[mid]=arr[l];
                arr[l]=t;
                l++;mid++;
            }
            else{
                mid++;
            }
        }
    }
}