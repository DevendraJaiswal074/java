//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2025-03-12

class Solution {
    public int maximumCount(int[] nums) {
        int posti_count = 0;
        int neg_count = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] >= 1){
                posti_count++;
            }
            else{
                if(nums[i] != 0 && nums[i] < 0){
                    neg_count++;
                }
            }
        }
        if( posti_count > neg_count || posti_count == neg_count){
            return posti_count;
        }
        else{
            return neg_count;
        }
    }
}