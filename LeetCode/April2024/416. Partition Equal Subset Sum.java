// https://github.com/MAZHARMIK/Interview_DS_Algo/blob/master/DP/Partition%20Equal%20Subset%20Sum.cpp

/*
Approach-1 (Recursion + Memo)

class Solution {
    int[][] t = new int[201][20001];

    boolean solve(List<Integer> nums, int i, int x) {
        if (x == 0) {
            return true;
        }

        if (i >= nums.size()) {
            return false;
        }

        if (t[i][x] != -1) {
            return t[i][x] == 1;
        }

        boolean take = false;
        if (nums.get(i) <= x) {
            take = solve(nums, i + 1, x - nums.get(i));
        }

        boolean not_take = solve(nums, i + 1, x);

        t[i][x] = (take || not_take) ? 1 : 0;
        return take || not_take;
    }

    public boolean canPartition(int[] numsArr) {
        List<Integer> nums = new ArrayList<>();
        for (int num : numsArr) nums.add(num);

        int n = nums.size();
        int S = 0;
        for (int num : nums) {
            S += num;
        }

        if (S % 2 != 0) {
            return false;
        }

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int x = S / 2;

        return solve(nums, 0, x);
    }
}


//Approach-2
 
class Solution {
    public boolean subsetSum(int[] nums, int S) {
        int n = nums.length;
        boolean[][] t = new boolean[n + 1][S + 1];

        //It's not possible to get any sum when we have no elements
        for (int col = 0; col < S + 1; col++) {
            t[0][col] = false;
        }

        //It's always possible to get sum=0
        for (int row = 0; row < n + 1; row++) {
            t[row][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < S + 1; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j]; //including || excluding
                } else {
                    t[i][j] = t[i - 1][j]; //exluding because we can't pick element which is greater than target sum
                }
            }
        }

        return t[n][S];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        if (sum % 2 != 0)
            return false;

        sum = sum / 2;

        return subsetSum(nums, sum);
    }
}
*/