// https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/description/?envType=daily-question&envId=2025-03-28

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution{
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length;
        int n = grid[0].length;
        
        int Q = queries.length;
        int[] result = new int[Q];

        int[][] sortedQ = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            sortedQ[i][0] = queries[i];
            sortedQ[i][1] = i;
        }
        Arrays.sort(sortedQ, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[][] visited = new boolean[m][n];
        int points = 0;

        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;

        for (int i = 0; i < Q; i++) {
            int queryValue = sortedQ[i][0];
            int idx = sortedQ[i][1];

            while (!pq.isEmpty() && pq.peek()[0] < queryValue) {
                int[] top = pq.poll();
                int x = top[1], y = top[2];
                points++;

                for (int[] dir : directions) {
                    int i_ = x + dir[0];
                    int j_ = y + dir[1];
                    if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && !visited[i_][j_]) {
                        pq.offer(new int[]{grid[i_][j_], i_, j_});
                        visited[i_][j_] = true;
                    }
                }
            }
            result[idx] = points;
        }

        return result;
    }
}