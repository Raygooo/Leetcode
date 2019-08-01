package Q0374;

import java.math.BigInteger;

public class Q0374 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.guessNumber(2126753390));
    }
}


/**
 * My initial solution
 *
 * runtime: faster than 100%
 * Memory usage: less than 100%
 */

class Solution extends GuessGame {


    public int findIt(int min, int max) {
        int mid = min / 2 + max / 2;
        if ((min % 2 != 0) && (max % 2 != 0)) {
            mid = mid + 1;
        }
        if (max - min == 1) {
            if (guess(max) == 0) {
                return max;
            }
        }
        int guessResult = guess(mid);
        if (guessResult == 0) {
            return mid;
        } else if (guessResult > 0) {
            return findIt(mid, max);
        } else return findIt(min, mid);
    }


    public int guessNumber(int n) {
        return findIt(1, n);
    }
}



class GuessGame {

    private static final int n = 1702766719;


    int guess(int num) {
        if (num > n)
            return -1;
        if (num < n)
            return 1;
        return 0;
    }

}