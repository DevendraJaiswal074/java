//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08

class Solution {
    public int minimumOperations(int[] nums) {
        int[] maping = new int[101];
        for(int i = nums.length-1 ; i>=0 ;--i){
            if(++maping[nums[i]] > 1){
                return (i+3)/3;
            }
        }
        return 0;
    }
}