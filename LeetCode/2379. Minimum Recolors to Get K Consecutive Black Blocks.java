// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/?envType=daily-question&envId=2025-03-08

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int black = 0;
        int minRecoloring = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; ++i) {
            if (blocks.charAt(i) == 'B') {
                black++;
            }
            if (i >= k - 1) {
                minRecoloring = Math.min(k - black, minRecoloring);
                if (blocks.charAt(i - k + 1) == 'B') {
                    black--;
                }
            }
        }
        return minRecoloring;
    }
}