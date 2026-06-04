// Last updated: 6/4/2026, 10:34:56 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int s=0,l=n*m-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            int r = mid/n;
            int c = mid%n;
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                l=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}