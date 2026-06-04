// Last updated: 6/4/2026, 10:26:19 AM
class Solution {
    public int findCenter(int[][] arr) {
        if(arr[0][0]==arr[1][0]||arr[0][0]==arr[1][1]){
            return arr[0][0];
        }
        return arr[0][1];
    }
}