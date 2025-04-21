//https://leetcode.com/problems/count-the-hidden-sequences/?envType=daily-question&envId=2025-04-21

/*
 class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int curr = 0; // Simulates building the array starting from a[0] = 0
        int minVal = 0;
        int maxVal = 0;

        for (int d : differences) {
            curr += d;
            minVal = Math.min(minVal, curr);
            maxVal = Math.max(maxVal, curr);

            if ((upper - maxVal) - (lower - minVal) + 1 <= 0) {
                return 0;
            }
        }

        return (upper - maxVal) - (lower - minVal) + 1;
    }
}
 */