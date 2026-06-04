// Last updated: 6/4/2026, 10:34:59 AM
class Solution {
    public int climbStairs(int n) {
        if(n==1) 
            return 1;
        int[] arr = new int[n+1];
        arr[1] =1;
        arr[2] = 2;
        for(int i=3;i<n+1;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}