//https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;
        int currentValue = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                currentValue++;
                maxValue = Math.max(maxValue, currentValue);
            }
            else{
                currentValue = 0;
            }
        }
        return maxValue;
    }
}