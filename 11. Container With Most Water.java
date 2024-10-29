//https://leetcode.com/problems/container-with-most-water/submissions/1437574836/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxArea(int[] height) {
      int max = 0;
      int l = 0;
      int r = height.length - 1;
  
      while (l < r) {
        final int minHeight = Math.min(height[l], height[r]);
        max = Math.max(max, minHeight * (r - l));
        if (height[l] < height[r])
          ++l;
        else
          --r;
      }
  
      return max;
    }
  }