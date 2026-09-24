// Last updated: 24/9/2026, 3:07:48 pm
class Solution {
    public int findCenter(int[][] arr) {
        if(arr[0][0]==arr[1][0]||arr[0][0]==arr[1][1]){
            return arr[0][0];
        }
        return arr[0][1];
    }
}