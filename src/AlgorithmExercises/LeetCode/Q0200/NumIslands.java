package AlgorithmExercises.LeetCode.Q0200;

/**
 * @author :
 * @version :
 */
public class NumIslands {

}

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '2';
                    count++;
                    infectAround(grid, i, j);
                }

            }
        }
        return count;
    }

    void infectAround(char[][] grid, int i, int j) {
        if (i > 0 && grid[i - 1][j] == '1') {
            grid[i - 1][j] = '2';
            infectAround(grid, i - 1, j);
        }
        if (i < grid.length - 1 && grid[i + 1][j] == '1') {
            grid[i + 1][j] = '2';
            infectAround(grid, i + 1, j);
        }
        if (j > 0 && grid[i][j - 1] == '1') {
            grid[i][j - 1] = '2';
            infectAround(grid, i, j - 1);
        }
        if (j < grid[i].length - 1 && grid[i][j + 1] == '1') {
            grid[i][j + 1] = '2';
            infectAround(grid, i, j + 1);
        }
    }
}
