// Last updated: 6/4/2026, 10:32:08 AM
class Solution {
    public int findLHS(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length,len=0,max=0;
        for(int r=1;r<n;r++){
            int l=0;
            while(arr[r]-arr[l]>1){
                l++;
            }
            if(arr[r]-arr[l]==1){
                len=r-l+1;
                if(max<len){
                    max=len;
                }
            }
        }
        return max;
    }
}