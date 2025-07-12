//https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/?envType=daily-question&envId=2025-07-09

class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] freeArray = new int[n + 1];
        
        // First gap: from time 0 to startTime <sup> </sup>
        freeArray[0] = startTime[0];
        
        // Gaps between consecutive events
        for (int i = 1; i < n; i++) {
            freeArray[i] = startTime[i] - endTime[i - 1];
        }
        
        // Last gap: from endTime[n-1] to eventTime
        freeArray[n] = eventTime - endTime[n - 1];
        
        int maxSum = 0;
        int currSum = 0;
        int left = 0;
        
        // Sliding window to find maximum sum of (k+1) gaps
        for (int right = 0; right < freeArray.length; right++) {
            currSum += freeArray[right];
            
            // Window size should be at most (k+1)
            while (right - left + 1 > k + 1) {
                currSum -= freeArray[left];
                left++;
            }
            
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}