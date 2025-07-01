/*
https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/?envType=daily-question&envId=2025-04-09

class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                set.add(x);
            }
        }

        return set.size();
    }
}

*/