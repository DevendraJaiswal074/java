package LeetCode.June2024;

//https://leetcode.com/problems/distribute-candies-among-children-ii/description/?envType=daily-question&envId=2025-06-01

class Solution {
    public long distributeCandies(int n, int limit) {
        long ways = 0;

        // Loop through possible candies for the first child
        int minCh1 = Math.max(0, n - 2 * limit);
        int maxCh1 = Math.min(n, limit);

        for (int i = minCh1; i <= maxCh1; i++) {
            int remaining = n - i;

            int minCh2 = Math.max(0, remaining - limit);
            int maxCh2 = Math.min(remaining, limit);

            ways += (maxCh2 - minCh2 + 1);
        }

        return ways;
    }
}