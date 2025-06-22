//https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedValue= n*(n+1)/2;
        int sumOFn = 0;

        for(int i = 0; i < n ; i++){
            sumOFn += nums[i];
        }
        return expectedValue-sumOFn;
    }
}