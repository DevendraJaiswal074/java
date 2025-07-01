//https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/?envType=daily-question&envId=2025-04-26

/* 
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long count = 0;

        for (int start = 0; start < n; ++start) {
            int currentMin = nums[start];
            int currentMax = nums[start];

            for (int end = start; end < n; ++end) {
                currentMin = Math.min(currentMin, nums[end]);
                currentMax = Math.max(currentMax, nums[end]);

                if (currentMin == minK && currentMax == maxK) {
                    count++;
                }
            }
        }

        return count;
    }
}


//Approach-2 : Sliding Window
//T.C : O(n)
//S.C : O(1)
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int minPosition = -1;
        int maxPosition = -1;
        int leftBound = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }

            if (nums[i] == minK) {
                minPosition = i;
            }

            if (nums[i] == maxK) {
                maxPosition = i;
            }

            int count = Math.min(minPosition, maxPosition) - leftBound;

            if (count > 0) {
                ans += count;
            }
        }

        return ans;
    }
}
*/