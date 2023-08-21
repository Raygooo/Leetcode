package AlgorithmExercises.LeetCode.Q0283;

/**
 * Class Q0283 is created on 2019/12/23 13:07.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0283 {
}

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }
}

class Solution2 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num :
                nums) {
            if (num != 0)
                nums[index++] = num;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}