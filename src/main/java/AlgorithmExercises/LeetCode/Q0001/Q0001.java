package AlgorithmExercises.LeetCode.Q0001;

public class Q0001 {
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i ++){
            for (int j = i + 1; j < len; j ++)
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        return result;
    }
}