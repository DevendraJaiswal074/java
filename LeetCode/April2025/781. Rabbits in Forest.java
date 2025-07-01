// https://leetcode.com/problems/rabbits-in-forest/?envType=daily-question&envId=2025-04-20

/*
class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : answers) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int total = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();      // The answer given by rabbit
            int count = entry.getValue(); // How many rabbits gave that answer

            int groupSize = x + 1;
            int groups = (int) Math.ceil((double) count / groupSize);

            total += groups * groupSize;
        }

        return total;
    }
}

 */