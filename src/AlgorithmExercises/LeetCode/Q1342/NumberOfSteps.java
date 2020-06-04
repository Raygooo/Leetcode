package AlgorithmExercises.LeetCode.Q1342;

/**
 * Class numberOfSteps is created on 2020/4/10 22:49.
 *
 * @author Ray
 * @version 2020/4/10
 **/

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(Solution.numberOfSteps(14));
    }
}

class Solution {
    public static int numberOfSteps (int num) {
        if (num == 0)
            return 0;

        if (num % 2 == 0)
            num = num / 2;

        else if (num % 2 != 0)
            num = num - 1;

        return 1 + numberOfSteps(num);
    }
}
