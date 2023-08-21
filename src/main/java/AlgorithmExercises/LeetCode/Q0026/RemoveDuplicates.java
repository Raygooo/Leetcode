package AlgorithmExercises.LeetCode.Q0026;

/**
 * @author :
 * @version :
 */
public class RemoveDuplicates {
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int a = nums[0];
        int p = 1;
        for (int i : nums) {
            if (i != a) {
                a = i;
                nums[p] = i;
                p++;
            }
        }
        return p;
    }
}