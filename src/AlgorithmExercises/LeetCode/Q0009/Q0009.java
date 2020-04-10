package AlgorithmExercises.LeetCode.Q0009;

public class Q0009 {


}

/**
 * My initial solution
 *
 * runtime: faster than 40.89%
 * Memory usage: less than 7.9%
 */
class Solution {
    public boolean isPalindrome(int x) {
        char[] nums = String.valueOf(x).toCharArray();
        int len = nums.length;
        for (int i = 0; i < len / 2; i++) {
            if (nums[i] != nums[len - i - 1])
                return false;
        }
        return true;
    }
}

/**
 * Fastest solution online
 */

class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNum = 0;

        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x = x/10;
        }

        return x == revertNum || x == revertNum/10;
    }
}


