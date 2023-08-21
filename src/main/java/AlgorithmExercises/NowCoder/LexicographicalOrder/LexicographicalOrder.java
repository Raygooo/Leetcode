package AlgorithmExercises.NowCoder.LexicographicalOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Class LexicographicalOrder is created on 04/08/2019 22:38.
 * https://www.nowcoder.com/questionTerminal/6c9d8d2e426c4c58bbadfdf67d591696
 *
 * @author Ray
 * @version 04/08/2019
 **/

public class LexicographicalOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        while (sc.hasNext()) {
            long n = sc.nextInt();
            long m = sc.nextInt();
            System.out.println(solution.solution(n, m));
            char c = '0';
            String a = "a";
        }
    }


    static class Solution {

        long solution(long n, long m) {
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                arr.add(String.valueOf(i));
            }
            Collections.sort(arr);
            return Long.parseLong(arr.get((int) m - 1));
        }
    }


    static class Solution2 {

        private int count = 0;
        private int depth = 0;

        public long solution(long n, long m) {
            depth = String.valueOf(n).length();

            long digits = ((long) Math.pow(10, depth - 1));
            int maxNumber = (int) (n / digits);
            return solutionHelper(depth - 1, maxNumber, 1, 9, n % digits, m);

        }

        public long solutionHelper(int depthIndex, int maxNumber, int left, int right, long n, long m) {

            if (depthIndex == 0) {
                return -1;
            }

            long digits;
            int nextMaxNumber;

            if (depthIndex > 1) {
                digits = ((long) Math.pow(10, depthIndex - 1)); // i.e. 283 digits == 100;
                nextMaxNumber = (int) (n / digits);
            } else {
                digits = 1;
                nextMaxNumber = -1;
            }
            for (int i = left; i <= right; i++) {
                count++;
                if (count == m) {
                    return i;
                }
                if (i == maxNumber && nextMaxNumber != 0) {
                    long temp = solutionHelper(depthIndex - 1, nextMaxNumber, 0, nextMaxNumber, n % digits, m);
                    if (temp != -1)
                        return digits * i + temp;
                } else {
                    long temp = solutionHelper(depthIndex - 1, nextMaxNumber, 0, 9, n % digits, m);
                    if (temp != -1)
                        return digits * i + temp;
                }
            }
            return -1;
        }


    }


}
