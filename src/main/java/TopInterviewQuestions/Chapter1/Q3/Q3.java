package TopInterviewQuestions.Chapter1.Q3;

public class Q3 {
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target) {
                return true;
            } else if (matrix[i][0] > target) {
                return searchBackward(matrix, i - 1, target);
            } else if (i == matrix.length - 1) {
                return searchBackward(matrix, i, target);
            }
        }
        return false;
    }

    public boolean searchBackward(int[][] matrix, int lineNum, int target) {
        for (int i = lineNum; i >= 0; i--) {
            if (searchHorizontally(matrix, i, target)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchHorizontally(int[][] matrix, int lineNum, int target) {
        for (int i = 0; i < matrix[lineNum].length; i++) {
            if (matrix[lineNum][i] == target) {
                return true;
            } else if (matrix[lineNum][i] > target) {
                return false;
            }
        }
        return false;
    }
}

/**
 * https://leetcode-cn.com/problems/search-a-2d-matrix-ii/solution/sou-suo-er-wei-ju-zhen-ii-by-leetcode-2/
 */
class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix[0][0] > target || matrix[m - 1][n - 1] < target) {
            return false;
        }
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col >= 0 &&
                row < matrix.length && col < matrix[0].length) {
            if (target < matrix[row][col]) {
                row--;
            } else if (target > matrix[row][col]) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }
}
