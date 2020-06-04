package AlgorithmExercises.LeetCode.Q0027;

/**
 * @author :
 * @version :
 */
public class RemoveElement {
}

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int p = 0;

        for (int num : nums) {
            if (num != val) {
                nums[p] = num;
                p++;
            }
        }

        return p;
    }
}
