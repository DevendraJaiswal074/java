/*You are given an m x n integer matrix points (0-indexed). Starting with 0 points, you want to maximize the number of points you can get from the matrix.

To gain points, you must pick one cell in each row. Picking the cell at coordinates (r, c) will add points[r][c] to your score.

However, you will lose points if you pick a cell too far from the cell that you picked in the previous row. For every two adjacent rows r and r + 1 (where 0 <= r < m - 1), picking cells at coordinates (r, c1) and (r + 1, c2) will subtract abs(c1 - c2) from your score.

Return the maximum number of points you can achieve.

abs(x) is defined as:

x for x >= 0.
-x for x < 0. */

class Solution {
    public long maxPoints(int[][] points) {
        int row = points.length;
        int col = points[0].length;
        long[] dp = new long[col];
        
        for (int i = 0; i < col; i++) {
            dp[i] = points[0][i];
        }
        
        for (int r = 1; r < row; r++) {
            long[] leftMax = new long[col];
            long[] rightMax = new long[col];
            long[] newDp = new long[col];
            
            leftMax[0] = dp[0];
            for (int i = 1; i < col; i++) {
                leftMax[i] = Math.max(leftMax[i-1], dp[i] + i);
            }
            
            rightMax[col-1] = dp[col-1] - (col-1);
            for (int i = col-2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i+1], dp[i] - i);
            }
            
            for (int i = 0; i < col; i++) {
                newDp[i] = Math.max(leftMax[i] - i, rightMax[i] + i) + points[r][i];
            }
            
            dp = newDp;
        }
        
        long result = Long.MIN_VALUE;
        for (long value : dp) {
            result = Math.max(result, value);
        }
        
        return result;
    }
}