package AlgorithmExercises.LeetCode.Q0661;

import java.util.Arrays;

/**
 * Class Q0661 is created on 06/08/2019 21:14.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0661 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.imageSmoother(new int[][]{
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
                {14, 15, 16}
        })));

    }
}

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int surroundPointCount;
        int surroundPointColorCount;
        int[][] newImage = new int[M.length][M[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                surroundPointCount = 0;
                surroundPointColorCount = 0;

                surroundPointColorCount += M[i][j]; //center
                surroundPointCount++;

                if (i > 0) {
                    surroundPointColorCount += M[i - 1][j]; // Up
                    surroundPointCount++;
                    if (j > 0) {
                        surroundPointColorCount += M[i - 1][j - 1];// Up-Left
                        surroundPointCount++;
                    }

                    if (j < M[i].length - 1) {
                        surroundPointColorCount += M[i - 1][j + 1];// Up-Right
                        surroundPointCount++;
                    }
                }
                if (i < M.length - 1) {
                    surroundPointColorCount += M[i + 1][j];// Down
                    surroundPointCount++;
                    if (j > 0) {
                        surroundPointColorCount += M[i + 1][j - 1];// Down-Left
                        surroundPointCount++;
                    }

                    if (j < M[i].length - 1) {
                        surroundPointColorCount += M[i + 1][j + 1];// Down-Right
                        surroundPointCount++;

                    }
                }

                if (j > 0) {
                    surroundPointColorCount += M[i][j - 1];// Left
                    surroundPointCount++;
                }

                if (j < M[i].length - 1) {
                    surroundPointColorCount += M[i][j + 1];// Right
                    surroundPointCount++;
                }

                int newColor = surroundPointColorCount / surroundPointCount;
                newImage[i][j] = newColor;
            }
        }
        return newImage;
    }
}

/**
 * from leetcode
 *
 * 提醒我用单独的方法来对每个点进行计算
 * 完全在循环里面会比较复杂
 *
 * 把每个点的数据传入方法即可
 *
 */
class Solution1 {
    public int[][] imageSmoother(int[][] M) {

        int r = M.length;
        int c = M[0].length;
        int[][] copy = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                copy[i][j] = helper(M, i, j);
            }
        }
        return copy;
    }

    public int helper(int[][] M, int i, int j) {
        int r = M.length;
        int c = M[0].length;
        int sum = 0, count = 0;

        for (int n = -1; n < 2; n++) {
            for (int m = -1; m < 2; m++) {
                if (i+n<0 || i+n>=r || j+m<0 || j+m >= c) {
                    continue;
                }
                count++;
                sum += M[i+n][j+m];
            }
        }

        return sum/count;
    }
}
