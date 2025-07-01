//https://leetcode.com/problems/count-the-number-of-ideal-arrays/?envType=daily-question&envId=2025-04-22

/*
 class Solution {
    final int M = (int)1e9 + 7;

    void findSets(int m, int[] count, int[][] dp) {
        if (dp[m][1] != 0) return;

        dp[m][1] = 1;
        count[1]++;

        for (int div = 2; div <= m; div++) {
            if (m % div == 0) {
                findSets(m / div, count, dp);

                for (int len = 1; len < 15; len++) {
                    if (dp[m / div][len] != 0) {
                        dp[m][len + 1] = (dp[m][len + 1] + dp[m / div][len]) % M;
                        count[len + 1] = (count[len + 1] + dp[m / div][len]) % M;
                    }
                }
            }
        }
    }

    long findPower(long a, long b) {
        if (b == 0) return 1;

        long half = findPower(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }

    int modularnCr(int n, int r, long[] fact) {
        if (r < 0 || r > n) return 0;

        long b = (fact[r] * fact[n - r]) % M;
        return (int)((fact[n] * findPower(b, M - 2)) % M);
    }

    public int idealArrays(int n, int maxValue) {
        int[][] dp = new int[maxValue + 1][15];
        int[] count = new int[15];

        for (int val = 1; val <= maxValue; val++) {
            findSets(val, count, dp);
        }

        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % M;
        }

        long result = 0;
        for (int len = 1; len < 15; len++) {
            if (n < len) break;
            if (count[len] != 0) {
                long possibilities = modularnCr(n - 1, len - 1, fact);
                result = (result + (count[len] * possibilities) % M) % M;
            }
        }

        return (int)result;
    }
}
 */