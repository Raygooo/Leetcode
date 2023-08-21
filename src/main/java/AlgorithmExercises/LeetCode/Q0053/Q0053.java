package AlgorithmExercises.LeetCode.Q0053;

/**
 * Class Q0053 is created on 2019/11/16 21:25.
 *
 * @author Ray
 * @version 2019/11/16
 **/

public class Q0053 {

    public static void main(String[] args) {

    }
}

/**
 * 动态规划
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0 && nums[i] > 0) {
                sum = 0;
            }
            sum += nums[i];
            if (sum < 0) {
                sum = nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
