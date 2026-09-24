// Last updated: 24/9/2026, 3:09:18 pm
class Solution {
    public int step(int num) {

        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return 1 + step(num / 2);
        }

        return 1 + step(num - 1);

    }

    public int numberOfSteps(int num) {

        return step(num);
    }
}