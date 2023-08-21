package AlgorithmExercises.LeetCode.Q0289;

import java.util.Arrays;

/**
 * Class GameOfLife is created on 2020/4/2 15:39.
 *
 * @author Ray
 * @version 2020/4/2
 **/

public class GameOfLife {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] input = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        s.gameOfLife(input);
        System.out.println(Arrays.deepToString(input));

    }
}


class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int surround = 0;
                int[] pass = new int[]{1, 0, -1};
                for (int p : pass) {
                    for (int p2 : pass) {
                        surround += pickup(board, i + p, j + p2, m, n);
                    }
                }
                surround -= board[i][j];

                if (board[i][j] == 1 && (surround < 2 || surround > 3)) {
                    board[i][j] = 2;
                } else if (board[i][j] == 0 && surround == 3) {
                    board[i][j] = 3;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2)
                    board[i][j] = 0;
                if (board[i][j] == 3)
                    board[i][j] = 1;
            }
        }
    }

    int pickup(int[][] board, int i, int j, int m, int n) {
        if (i >= 0 && i < m && j >= 0 && j < n) {
            //2 represent 1->0
            if (board[i][j] == 2) {
                return 1;
            }
            //3 represent 0->1
            else if (board[i][j] == 3) {
                return 0;
            } else
                return board[i][j];
        }
        return 0;
    }

}
