//https://leetcode.com/problems/find-the-k-th-character-in-string-game-ii/description/?envType=daily-question&envId=2025-07-04

class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n + 1];
        lengths[0] = 1; // Initially "a"

        // Step 1: Precompute the length after each operation
        for (int i = 0; i < n; i++) {
            if (lengths[i] > k) {
                lengths[i + 1] = lengths[i]; // No need to double beyond k
            } else {
                lengths[i + 1] = lengths[i] * 2;
            }
        }

        int shift = 0; // To track how many times op==1 was applied on the kth character

        // Step 2: Trace back from last operation
        for (int i = n - 1; i >= 0; i--) {
            if (k > lengths[i]) {
                // We're in the second half added during the operation
                k -= lengths[i];
                if (operations[i] == 1) {
                    shift++; // This half was shifted
                }
            }
            // else: still in the first half, nothing to change
        }

        // Step 3: Compute the original character after all backward steps
        char result = (char) ((('a' - 'a' + shift) % 26) + 'a');
        return result;
    }
}