package LeetCode.April2024;

//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/?envType=daily-question&envId=2025-04-03

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long result = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for(int j = 1; j<n ; j++){
            leftMax[j] = Math.max(leftMax[j-1],nums[j-1]);
        }

        for(int j = n-2; j>=0 ;j-- ){
            rightMax[j] = Math.max(rightMax[j+1],nums[j+1]);
        }
        
        for(int i= 1;i<n-1;i++){
            result = Math.max(result, (long)(leftMax[i] - nums[i])*rightMax[i]);
        }
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1 ; j<n ; j++){
        //         for(int k = j+1; k<n ; k++){
        //             result = Math.max(result,(long)(nums[i]-nums[j])*nums[k]);
        //         }
        //     }
        // }

        return result;
    }
}