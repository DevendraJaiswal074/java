//https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=daily-question&envId=2025-04-05

/*
class Solution {

    private void solve(int[] nums, int i, List<Integer> currSubset, List<List<Integer>> subsets) {
        if (i == nums.length) {
            subsets.add(new ArrayList<>(currSubset));
            return;
        }

        currSubset.add(nums[i]);
        solve(nums, i + 1, currSubset, subsets);
        currSubset.remove(currSubset.size() - 1);
        solve(nums, i + 1, currSubset, subsets);
    }

    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> currSubset = new ArrayList<>();
        solve(nums, 0, currSubset, subsets);

        int result = 0;
        for (List<Integer> subset : subsets) {
            int xor = 0;
            for (int num : subset) {
                xor ^= num;
            }
            result += xor;
        }
        return result;
    }
} */
