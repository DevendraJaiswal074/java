//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double sum = 0;
      for (int i = 0; i < k; ++i){
        sum += nums[i];
      }
      double final_value = sum;
  
      for (int i = k; i < nums.length; ++i) {
        sum += nums[i] - nums[i - k];
        final_value = Math.max(final_value, sum);
      }
  
      return final_value / k;
    }
  }