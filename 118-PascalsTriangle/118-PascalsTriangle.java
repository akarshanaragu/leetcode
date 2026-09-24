// Last updated: 24/9/2026, 3:14:36 pm
class Solution {
    
    public List<List<Integer>> generate(int r) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < r; i++) {

            List<Integer> row = new ArrayList<>();
            int num = 1;

            for (int j = 0; j <= i; j++) {
                row.add(num);
                num = num * (i - j) / (j + 1);
            }

            res.add(row);
        }

        return res;
    }
}