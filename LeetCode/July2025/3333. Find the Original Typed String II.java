//https://leetcode.com/problems/find-the-original-typed-string-ii/description/?envType=daily-question&envId=2025-07-02

package LeetCode.July2025;

import java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

class Solution {
    int M = (int)1e9 + 7;
    int[][] t;

    public int solve(int i, int count, List<Integer> freq, int k) {
        if (i >= freq.size()) {
            if (count < k) return 1; // found invalid string
            return 0;
        }

        if (t[i][count] != -1) return t[i][count];

        long result = 0;
        for (int take = 1; take <= freq.get(i); take++) {
            if (count + take < k) {
                result = (result + solve(i + 1, count + take, freq, k)) % M;
            } else {
                break;
            }
        }

        return t[i][count] = (int) result;
    }

    public int possibleStringCount(String word, int k) {
        if (k > word.length()) return 0;

        List<Integer> freq = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                freq.add(count);
                count = 1;
            }
        }
        freq.add(count);

        long P = 1; // total possible strings
        for (int f : freq) {
            P = (P * f) % M;
        }

        if (freq.size() >= k) return (int) P;

        int n = freq.size();
        t = new int[n + 1][k + 1];
        for (int[] row : t) Arrays.fill(row, -1); // initialize memo table

        long invalidCount = solve(0, 0, freq, k);
        return (int)((P - invalidCount + M) % M);
    }
}