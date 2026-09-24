// Last updated: 24/9/2026, 3:14:34 pm
class Solution {

    public List<Integer> getRow(int rowIndex) {

        int n = rowIndex;
        long num = 1;

        List<Integer> row = new ArrayList<>();

        for (int j = 0; j <= n; j++) {

            row.add((int) num);
            num = num * (n - j) / (j + 1);
        }

        return row;
    }
}