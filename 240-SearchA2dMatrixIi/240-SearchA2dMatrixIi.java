// Last updated: 6/4/2026, 10:33:12 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0,l=matrix[0].length-1;
        while(s<matrix.length&&l>=0){
            if(matrix[s][l]==target){
                return true;
            }
            else if(matrix[s][l]>target){
                l--;
            }
            else{
                s++;
            }
        }
        return false;
    }
}