package LeetCode.Q0007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q0007 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(10));
        System.out.println(s.reverse(-123));
        System.out.println(s.reverse(123));
        System.out.println(s.reverse(1534236469));
        System.out.println(s.reverse(9000));
        System.out.println(s.reverse(10));
//        System.out.println((10%100)/10);
    }
}


class Solution {
    public int reverse(int x) {

        long num = Math.abs(x);
        List<Long> digits = new ArrayList<>();

        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }

        Collections.reverse(digits);

        long result = 0;

        for (int i = 1; digits.size() != 0; i++) {
            result += digits.remove(0) * Math.pow(10, i - 1);
        }

        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31))
            return 0;
        if (x > 0)
            return (int)result;
        else return (int)-result;
    }

    public int getNumLength(int x) {

        if (x == 0) {
            return 1;
        }
        int len = 0;
        for (int i = Math.abs(x); i != 0; i = i / 10) {
            len++;
        }
        return len;
    }
}

class Solution2 {
    public int reverse(int x) {

        List<Integer> digits = new ArrayList<>();

        for (int i = 10; i < Math.pow(10, getNumLength(x) + 1); i = i * 10) {
            digits.add((x % i) / (i / 10));
        }
        Collections.reverse(digits);
        int result = 0;
        for (int i = 1; digits.size() != 0; i++) {
            result += digits.remove(0) * Math.pow(10, i-1);
        }
        return result;
    }

    public int getNumLength(int x) {

        if (x == 0) {
            return 1;
        }
        int len = 0;
        for (int i = Math.abs(x); i != 0; i = i / 10) {
            len++;
        }
        return len;
    }
}
