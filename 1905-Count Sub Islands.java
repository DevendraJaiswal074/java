/*
 * You are given two m x n binary matrices grid1 and grid2 containing only 0's (representing water) and 1's (representing land). An island is a group of 1's connected 4-directionally (horizontal or vertical). Any cells outside of the grid are considered water cells.

An island in grid2 is considered a sub-island if there is an island in grid1 that contains all the cells that make up this island in grid2.

Return the number of islands in grid2 that are considered sub-islands.

 

Example 1:


Input: grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], grid2 = [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]
Output: 3
Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
The 1s colored red in grid2 are those considered to be part of a sub-island. There are three sub-islands.
Example 2:


Input: grid1 = [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], grid2 = [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]
Output: 2 
Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
The 1s colored red in grid2 are those considered to be part of a sub-island. There are two sub-islands.
 */

 class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length;
        int count = 0;

        // Traverse through each cell in grid2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we find a land in grid2, we check if it's part of a sub-island
                if (grid2[i][j] == 1) {
                    // If DFS returns true, it is a sub-island
                    if (dfs(grid1, grid2, i, j, m, n)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // DFS to check if the island in grid2 starting from (i, j) is a sub-island
    private boolean dfs(int[][] grid1, int[][] grid2, int i, int j, int m, int n) {
        // If out of bounds or the cell is water in grid2, return true
        if (i < 0 || j < 0 || i >= m || j >= n || grid2[i][j] == 0) {
            return true;
        }

        // If the corresponding cell in grid1 is water, it cannot be a sub-island
        if (grid1[i][j] == 0) {
            return false;
        }

        // Mark the cell as visited by setting it to 0 in grid2
        grid2[i][j] = 0;

        // Perform DFS in all 4 directions
        boolean up = dfs(grid1, grid2, i - 1, j, m, n);
        boolean down = dfs(grid1, grid2, i + 1, j, m, n);
        boolean left = dfs(grid1, grid2, i, j - 1, m, n);
        boolean right = dfs(grid1, grid2, i, j + 1, m, n);

        // Return true if all parts of this island in grid2 are sub-islands
        return up && down && left && right;
    }
}