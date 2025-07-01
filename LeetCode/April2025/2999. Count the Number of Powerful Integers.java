//https://leetcode.com/problems/count-the-number-of-powerful-integers/description/?envType=daily-question&envId=2025-04-10

class Solution {
    private long solve(String str, String suffix, int limit) {
        if (str.length() < suffix.length()) {
            return 0;
        }

        long count = 0;
        String trailing = str.substring(str.length() - suffix.length());
        int prefixLength = str.length() - suffix.length();

        for (int i = 0; i < prefixLength; i++) {
            int digit = str.charAt(i) - '0';

            if (digit <= limit) {
                count += digit * Math.pow(limit + 1, prefixLength - i - 1);
            } else {
                count += Math.pow(limit + 1, prefixLength - i);
                return count;
            }
        }

        if (trailing.compareTo(suffix) >= 0) {
            count++;
        }

        return count;
    }

    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String startStr = String.valueOf(start - 1);
        String finishStr = String.valueOf(finish);
        return solve(finishStr, s, limit) - solve(startStr, s, limit);
    }
}