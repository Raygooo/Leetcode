package LeetCode.Q0461;

/**
 * Class Q0461 is created on 2019/12/23 11:39.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0461 {
}

class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while (x != 0 || y != 0) {
            int x1 = x % 2;
            int y1 = y % 2;
            if (x1 != y1)
                res++;
            x /= 2;
            y /= 2;
        }
        return res;
    }
}
