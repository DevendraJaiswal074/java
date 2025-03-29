//https://leetcode.com/problems/find-missing-and-repeated-values/submissions/1565177094/?envType=daily-question&envId=2025-03-06

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      final int n = grid.length;
      final int nSquared = n * n;
      int[] count = new int[nSquared + 1];
  
      for (int[] row : grid)
        for (final int num : row)
          ++count[num];
  
      int repeated = -1;
      int missing = -1;
  
      for (int i = 1; i <= nSquared; ++i) {
        if (count[i] == 2)
          repeated = i;
        if (count[i] == 0)
          missing = i;
      }
  
      return new int[] {repeated, missing};
    }
  }