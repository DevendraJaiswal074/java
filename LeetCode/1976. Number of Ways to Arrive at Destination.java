// https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/description/?envType=daily-question&envId=2025-03-23

import java.util.*;

class Solution {
    private static final int MOD = 1000000007;

    public int countPaths(int n, int[][] roads) {
        // Make Adjacency List
        List<List<long[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            adj.get(road[0]).add(new long[]{road[1], road[2]});
            adj.get(road[1]).add(new long[]{road[0], road[2]});
        }

        // Apply Dijkstra and keep tracking number of ways to reach a node with min_cost
        PriorityQueue<long[]> minheap = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        minheap.offer(new long[]{0, 0}); // {cost, node}: Source is 0
        boolean[] processed = new boolean[n];

        long[] countWays = new long[n]; // Count total ways to reach a node from start (0)
        countWays[0] = 1; // There is 1 way to reach the start node
        long[] minCost = new long[n];
        Arrays.fill(minCost, Long.MAX_VALUE);
        minCost[0] = 0; // Initialize min_cost for the source node

        while (!minheap.isEmpty()) {
            long[] curr = minheap.poll();
            long cost = curr[0];
            int currNode = (int) curr[1];

            if (processed[currNode]) continue; // Skip if already processed
            processed[currNode] = true;

            for (long[] neighbor : adj.get(currNode)) {
                int nbr = (int) neighbor[0];
                long weight = neighbor[1];

                if (!processed[nbr]) {
                    if (cost + weight == minCost[nbr]) {
                        // Found another shortest path
                        countWays[nbr] = (countWays[nbr] + countWays[currNode]) % MOD;
                    } else if (cost + weight < minCost[nbr]) {
                        // Found a shorter path
                        minCost[nbr] = cost + weight;
                        countWays[nbr] = countWays[currNode];
                        minheap.offer(new long[]{minCost[nbr], nbr});
                    }
                }
            }
        }

        return (int) countWays[n - 1];
    }
}
