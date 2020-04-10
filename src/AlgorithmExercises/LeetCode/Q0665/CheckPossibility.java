package AlgorithmExercises.LeetCode.Q0665;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class CheckPossibility is created on 2020/4/7 16:16.
 *
 * @author Ray
 * @version 2020/4/7
 **/

public class CheckPossibility {
    //TODO
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkPossibility(new int[]{2,3,3,2,4}));
    }
}

class Solution {
    public boolean checkPossibility(int[] nums) {

        if (nums.length < 3)
            return true;

        boolean p = false;

        int pre = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i + 1] < nums[i]){

            }
        }
        return false;
    }
}
