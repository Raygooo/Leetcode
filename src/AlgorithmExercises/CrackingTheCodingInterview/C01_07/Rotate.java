package AlgorithmExercises.CrackingTheCodingInterview.C01_07;

import java.util.Arrays;

/**
 * Class Rotate is created on 2020/4/7 15:42.
 *
 * @author Ray
 * @version 2020/4/7
 **/

public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Solution solution = new Solution();
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }


}


class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                switchReference(matrix, i, j);
            }
        }
    }

    private void switchReference(int[][] matrix, int i, int j) {
        int tmp = matrix[i][j];
        int n = matrix.length - 1;
        matrix[i][j] = matrix[n - j][i];
        matrix[n - j][i] = matrix[n - i][n - j];
        matrix[n - i][n - j] = matrix[j][n - i];
        matrix[j][n - i] = tmp;
    }
}