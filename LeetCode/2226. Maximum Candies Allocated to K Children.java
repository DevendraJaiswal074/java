// https://leetcode.com/problems/maximum-candies-allocated-to-k-children/submissions/1574719131/?envType=daily-question&envId=2025-03-14

import java.util.Arrays;

class Solution {
    private boolean canAssign(long mid, int[] candies, long k) {
        long count = 0;
        for (int ele : candies) {
            if (ele >= mid)
                count += ele / mid;
        }
        return count >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        long low = 1;
        long high = Arrays.stream(candies).max().getAsInt();
        long mid;
        long max_candies = 0;

        // Binary search on the range of possible answers
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (canAssign(mid, candies, k)) {
                max_candies = Math.max(max_candies, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) max_candies;
    }
}