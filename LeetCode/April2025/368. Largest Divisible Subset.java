//https://leetcode.com/problems/largest-divisible-subset/description/?envType=daily-question&envId=2025-04-06

/*

public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        generate(0, nums, result, temp, -1);

        return result;
    }

    private void generate(int idx, int[] nums, List<Integer> result, List<Integer> temp, int prev) {
        if (idx >= nums.length) {
            if (temp.size() > result.size()) {
                result.clear();
                result.addAll(temp);
            }
            return;
        }

        if (prev == -1 || nums[idx] % prev == 0) {
            temp.add(nums[idx]);
            generate(idx + 1, nums, result, temp, nums[idx]);
            temp.remove(temp.size() - 1);
        }

        generate(idx + 1, nums, result, temp, prev);
    }
}


//Approach-2 (Using Bottom Up same as LIS) - Just need to keep track of how to print LIS
//T.C : O(n^2)
//S.C : O(n)
public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] t = new int[n];
        Arrays.fill(t, 1);

        int[] prevIdx = new int[n];
        Arrays.fill(prevIdx, -1);

        int lastChosenIndex = 0;
        int maxL = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (t[i] < t[j] + 1) {
                        t[i] = t[j] + 1;
                        prevIdx[i] = j;
                    }

                    if (t[i] > maxL) {
                        maxL = t[i];
                        lastChosenIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (lastChosenIndex >= 0) {
            result.add(nums[lastChosenIndex]);
            lastChosenIndex = prevIdx[lastChosenIndex];
        }

        return result;
    }
}
    
Approach 3

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        
        // Step-1: Sort the array and Find LIS length
        Arrays.sort(nums);
        int lis = 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0 && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                    if (lis < dp[i]) {
                        lis = dp[i];
                    }
                }
            }
        }
        
        // Step-2: Find one possible LIS
        int prev = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == lis && (prev == -1 || prev % nums[i] == 0)) {
                ans.add(nums[i]);
                lis--;
                prev = nums[i];
            }
        }
        
        return ans;
    }
}

*/