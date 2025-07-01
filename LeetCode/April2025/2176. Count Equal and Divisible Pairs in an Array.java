// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/?envType=daily-question&envId=2025-04-17

/*
 class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((i * j) % k == 0 && nums[i] == nums[j]) {
                    result++;
                }
            }
        }

        return result;
    }
}

//Approach-2 (Slight better approach);

class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int result = 0;

        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indicesMap.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        Set<Integer> div = new HashSet<>();
        for (int f = 1; f * f <= k; f++) {
            if (k % f == 0) {
                div.add(f);
                div.add(k / f);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : indicesMap.entrySet()) {
            List<Integer> indices = entry.getValue();
            Map<Integer, Integer> factorsMap = new HashMap<>();

            for (int i : indices) {
                int gcd = gcd(i, k);
                int j = k / gcd;

                result += factorsMap.getOrDefault(j, 0);

                for (int f : div) {
                    if (i % f == 0) {
                        factorsMap.put(f, factorsMap.getOrDefault(f, 0) + 1);
                    }
                }
            }
        }

        return result;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
 */