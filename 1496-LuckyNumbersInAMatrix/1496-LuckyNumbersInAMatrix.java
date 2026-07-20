// Last updated: 20/7/2026, 9:23:43 am
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            int min = 0; 
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][min]) {
                    min = j;
                }
            }

            boolean b = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][min] > matrix[i][min]) {
                    b = false;
                    break;
                }
            }

            if (b) {
                result.add(matrix[i][min]);
            }
        }

        return result;
    }
}