//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/?envType=daily-question&envId=2025-04-02

/* Approach 1

class Solution {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    result = Math.max(result, (long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        
        return result;
    }
}     

Approach 2

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;

        long result = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for(int i = 1; i<n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], nums[i-1]);
        }

        for(int i = n-2; i>=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1],nums[i+1]);
        }

        for(int j = 1; j < n-1; j++ ){
            result  = Math.max(result, (long)(leftMax[j]-nums[j])*rightMax[j]);
        }

        return result;
    }
}

Approach 3

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long result = 0;
        long maxDiff = 0;
        long maxi = 0;
        
        for (int k = 0; k < n; k++) {
            result = Math.max(result, maxDiff * nums[k]);
            maxDiff = Math.max(maxDiff, maxi - nums[k]);
            maxi = Math.max(maxi, nums[k]);
        }
        return result;
    }
}

*/