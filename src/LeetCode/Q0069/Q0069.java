package LeetCode.Q0069;

/**
 * Class LeetCode.Q0069.LeetCode.Q0069 is created on 02/08/2019 00:29.
 *
 * @author Ray
 * @version 02/08/2019
 **/

public class Q0069 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.mySqrt(8));

//        System.out.println(Math.sqrt(Integer.MAX_VALUE)); //46340.95
    }
}

class Solution {
    public int mySqrt(int x) {
        int k = x;
        int count = 0;
        while (k != 0) {
            k = k / 2;
            count++;
        }
        int top = 0;
        if (count == 31)
            top = 46340;
        else
            top = (int) Math.pow(2, (count / 2) + 1);
        for (int i = (int) Math.pow(2, (count / 2) - 1); i <= top; i++) {
            if (Math.pow(i, 2) <= x && (long) Math.pow(i + 1, 2) > x)
                return i;
        }
        return 0;
    }
}


/**
 * from leetcode solution
 */
class Solution2 {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        long left = 1, right = x;
        long middle = 1;
        long test = 1;
        while(left <= right){
            middle = (left + right) / 2;
            test = middle * middle;
            if(test == x) return (int) middle;

            if(test > x)  right = middle - 1;
            else left = middle + 1;
        }
        return (int)right;
    }
}
