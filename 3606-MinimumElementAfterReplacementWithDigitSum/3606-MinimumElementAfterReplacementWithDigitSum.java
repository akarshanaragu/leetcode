// Last updated: 6/4/2026, 10:25:25 AM
class Solution {
    public int replace(int n){
        int r = n; int sum =0;
        while(r!=0){
            int t = r%10;
            sum+=t;
            r=r/10;
        }
        return sum;
    }
    public int minElement(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = replace(arr[i]);
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}