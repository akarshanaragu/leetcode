// Last updated: 6/4/2026, 10:34:20 AM
class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int a=0;boolean b = true;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
        
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        
        }
         return arr[n-1];
    }
}