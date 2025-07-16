//https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/description/?envType=daily-question&envId=2025-07-16

class Solution {
    public int maximumLength(int[] nums) {
        int evenValue = 0, oddValue = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2==0){
                evenValue++;
            }else{
                oddValue++;
            }
        }

        int alternative = 1;
        int preValue = nums[0]%2;
        for(int j = 1; j<nums.length; ++j){
            int currentValue = nums[j]%2;
            if(currentValue != preValue){
                alternative++;
                preValue = currentValue;
            }
        }

        return Math.max(Math.max(alternative,evenValue),oddValue);
    }
}